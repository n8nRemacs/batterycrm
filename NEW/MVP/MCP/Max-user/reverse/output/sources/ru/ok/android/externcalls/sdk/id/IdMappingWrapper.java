package ru.ok.android.externcalls.sdk.id;

import android.content.Context;
import android.text.TextUtils;
import defpackage.sc7;
import defpackage.ti1;
import defpackage.u0e;
import defpackage.y6d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class IdMappingWrapper {
    private static final String CACHE_FILE_NAME = "ids";
    private static final String CACHE_SUBDIR = "external_calls";
    private static final int DISK_CACHE_RECORDS_LIMIT = 2000;
    private static final String LOG_TAG = "IdMappingWrapper";
    private final Context appContext;
    private final y6d log;
    private static final long ANONYM_INVALIDATE_INTERVAL_MS = TimeUnit.HOURS.toMillis(4);
    private static volatile IdMappingWrapper DEFAULT = null;
    private boolean changed = false;
    private boolean wasRead = false;
    private final LinkedHashMap<ParticipantId, ti1> externalToInternal = new LinkedHashMap<>();
    private final LinkedHashMap<ti1, ParticipantId> internalToExternal = new LinkedHashMap<>();
    private final LinkedHashMap<ParticipantId, Long> externalAnonymToCacheSaveTimestamp = new LinkedHashMap<>();

    private IdMappingWrapper(Context context, y6d y6dVar) {
        this.log = y6dVar;
        this.appContext = context;
        scheduleReadCacheFromDisk();
    }

    private synchronized void ensureMappingNotOutdated(ti1 ti1Var) {
        ensureMappingNotOutdated(this.internalToExternal.get(ti1Var));
    }

    public static IdMappingWrapper get(Context context, y6d y6dVar) {
        if (DEFAULT == null) {
            synchronized (IdMappingWrapper.class) {
                try {
                    if (DEFAULT == null) {
                        DEFAULT = new IdMappingWrapper(context.getApplicationContext(), y6dVar);
                    }
                } finally {
                }
            }
        }
        return DEFAULT;
    }

    private File getFile(boolean z) throws IOException {
        File file = new File(this.appContext.getCacheDir(), CACHE_SUBDIR);
        file.mkdirs();
        File file2 = new File(file, CACHE_FILE_NAME);
        if (file2.createNewFile()) {
            this.log.log(LOG_TAG, "getFile: empty file");
            if (!z) {
                return null;
            }
        }
        return file2;
    }

    private synchronized List<ParticipantId> getMappingKeysForWritingToDisk() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.externalToInternal.keySet());
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (listIterator.hasPrevious() && arrayList.size() < DISK_CACHE_RECORDS_LIMIT) {
                ParticipantId participantId = (ParticipantId) listIterator.previous();
                if (!participantId.isAnon) {
                    arrayList.add(participantId);
                }
            }
            Collections.reverse(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private synchronized boolean isParticipantIdOutdated(ParticipantId participantId) {
        if (!participantId.isAnon) {
            return false;
        }
        Long l = this.externalAnonymToCacheSaveTimestamp.get(participantId);
        if (l == null) {
            return false;
        }
        return System.currentTimeMillis() - l.longValue() > ANONYM_INVALIDATE_INTERVAL_MS;
    }

    private synchronized void read() throws IOException {
        boolean z = true;
        File file = getFile(true);
        if (file == null) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    break;
                }
                int iIndexOf = line.indexOf(9);
                if (iIndexOf != -1) {
                    String strSubstring = line.substring(0, iIndexOf);
                    String strSubstring2 = line.substring(iIndexOf + 1);
                    try {
                        ParticipantId participantIdFromStringValue = ParticipantId.fromStringValue(strSubstring);
                        ti1 ti1VarA = ti1.a(strSubstring2);
                        this.externalToInternal.put(participantIdFromStringValue, ti1VarA);
                        this.internalToExternal.put(ti1VarA, participantIdFromStringValue);
                        z = false;
                    } catch (NumberFormatException unused) {
                        this.log.log(LOG_TAG, "malformed internal id " + strSubstring + " : " + strSubstring2);
                    }
                }
            } finally {
            }
        }
        if (z) {
            this.log.log(LOG_TAG, "empty mapping");
        }
        bufferedReader.close();
    }

    private synchronized void removeIdMapping(ParticipantId participantId) {
        ti1 ti1Var = this.externalToInternal.get(participantId);
        this.externalToInternal.remove(participantId);
        this.externalAnonymToCacheSaveTimestamp.remove(participantId);
        this.internalToExternal.remove(ti1Var);
    }

    private synchronized void write() throws IOException {
        if (this.changed) {
            File file = getFile(false);
            if (file == null) {
                return;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                for (ParticipantId participantId : getMappingKeysForWritingToDisk()) {
                    ti1 ti1Var = this.externalToInternal.get(participantId);
                    if (ti1Var != null) {
                        bufferedWriter.write(participantId.toStringValue());
                        bufferedWriter.write(9);
                        bufferedWriter.write(ti1Var.b());
                        bufferedWriter.write(10);
                    }
                }
                bufferedWriter.close();
            } finally {
            }
        }
    }

    public synchronized void addMapping(ParticipantId participantId, ti1 ti1Var) {
        try {
            if (this.internalToExternal.get(ti1Var) == null) {
                this.changed = true;
            }
            this.internalToExternal.put(ti1Var, participantId);
            this.externalToInternal.put(participantId, ti1Var);
            if (participantId != null && participantId.isAnon) {
                this.externalAnonymToCacheSaveTimestamp.put(participantId, Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        this.externalToInternal.clear();
        this.externalAnonymToCacheSaveTimestamp.clear();
        this.internalToExternal.clear();
        this.changed = true;
        scheduleWriteCacheToDisk();
    }

    public synchronized ti1 getByExternal(ParticipantId participantId) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(participantId);
        return this.externalToInternal.get(participantId);
    }

    public synchronized ParticipantId getByInternal(ti1 ti1Var) {
        if (!this.wasRead) {
            return null;
        }
        ensureMappingNotOutdated(ti1Var);
        return this.internalToExternal.get(ti1Var);
    }

    public synchronized void readCacheFromDisk() {
        try {
            read();
        } catch (IOException e) {
            this.log.reportException(LOG_TAG, "read failed", e);
        }
        this.wasRead = true;
    }

    public void scheduleReadCacheFromDisk() {
        u0e.b().b(new sc7(this, 1));
    }

    public void scheduleWriteCacheToDisk() {
        u0e.b().b(new sc7(this, 0));
    }

    public synchronized void writeCacheToDisk() {
        if (this.changed) {
            try {
                write();
                this.changed = false;
            } catch (IOException e) {
                this.log.logException(LOG_TAG, "failed to commit", e);
            }
        }
    }

    private synchronized void ensureMappingNotOutdated(ParticipantId participantId) {
        if (participantId != null) {
            if (isParticipantIdOutdated(participantId)) {
                removeIdMapping(participantId);
            }
        }
    }
}
