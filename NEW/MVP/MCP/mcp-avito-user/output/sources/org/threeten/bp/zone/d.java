package org.threeten.bp.zone;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: TzdbZoneRulesProvider.java */
/* loaded from: classes16.dex */
public final class d extends i {

    /* renamed from: c, reason: collision with root package name */
    public List<String> f422245c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentSkipListMap f422246d = new ConcurrentSkipListMap();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f422247e = new CopyOnWriteArraySet();

    /* compiled from: TzdbZoneRulesProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f422248a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f422249b;

        /* renamed from: c, reason: collision with root package name */
        public final short[] f422250c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f422251d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f422251d = atomicReferenceArray;
            this.f422248a = str;
            this.f422249b = strArr;
            this.f422250c = sArr;
        }

        public final String toString() {
            return this.f422248a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() throws Throwable {
        URL urlNextElement;
        boolean zE2;
        InputStream inputStream = null;
        try {
            Enumeration<URL> resources = i.class.getClassLoader().getResources("org/threeten/bp/TZDB.dat");
            InputStream inputStream2 = null;
            boolean z12 = false;
            while (resources.hasMoreElements()) {
                try {
                    urlNextElement = resources.nextElement();
                } catch (Exception e12) {
                    e = e12;
                    inputStream = inputStream2;
                }
                try {
                    if (this.f422247e.add(urlNextElement.toExternalForm())) {
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                zE2 = e(inputStreamOpenStream);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = inputStreamOpenStream;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        zE2 = false;
                    }
                    z12 |= zE2;
                    inputStream2 = urlNextElement;
                } catch (Exception e13) {
                    e = e13;
                    inputStream = urlNextElement;
                    throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + inputStream, e);
                }
            }
            if (!z12) {
                throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    @Override // org.threeten.bp.zone.i
    public final f b(String str) {
        f fVar;
        w81.d.f(str, "zoneId");
        a aVar = (a) this.f422246d.lastEntry().getValue();
        int iBinarySearch = Arrays.binarySearch(aVar.f422249b, str);
        if (iBinarySearch < 0) {
            fVar = null;
        } else {
            try {
                short s5 = aVar.f422250c[iBinarySearch];
                AtomicReferenceArray<Object> atomicReferenceArray = aVar.f422251d;
                Object objB = atomicReferenceArray.get(s5);
                if (objB instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objB));
                    objB = org.threeten.bp.zone.a.b(dataInputStream.readByte(), dataInputStream);
                    atomicReferenceArray.set(s5, objB);
                }
                fVar = (f) objB;
            } catch (Exception e12) {
                StringBuilder sbA = r.A("Invalid binary time-zone data: TZDB:", str, ", version: ");
                sbA.append(aVar.f422248a);
                throw new ZoneRulesException(sbA.toString(), e12);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new ZoneRulesException("Unknown time-zone ID: ".concat(str));
    }

    @Override // org.threeten.bp.zone.i
    public final HashSet c() {
        return new HashSet(this.f422245c);
    }

    public final boolean e(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i12 = dataInputStream.readShort();
        String[] strArr = new String[i12];
        boolean z12 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = dataInputStream.readUTF();
        }
        int i14 = dataInputStream.readShort();
        String[] strArr2 = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            strArr2[i15] = dataInputStream.readUTF();
        }
        this.f422245c = Arrays.asList(strArr2);
        int i16 = dataInputStream.readShort();
        Object[] objArr = new Object[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i17] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(i12);
        for (int i18 = 0; i18 < i12; i18++) {
            int i19 = dataInputStream.readShort();
            String[] strArr3 = new String[i19];
            short[] sArr = new short[i19];
            for (int i22 = 0; i22 < i19; i22++) {
                strArr3[i22] = strArr2[dataInputStream.readShort()];
                sArr[i22] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i18], strArr3, sArr, atomicReferenceArray));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a aVar2 = (a) this.f422246d.putIfAbsent(aVar.f422248a, aVar);
            if (aVar2 != null) {
                String str = aVar2.f422248a;
                String str2 = aVar.f422248a;
                if (!str.equals(str2)) {
                    throw new ZoneRulesException(G.f("Data already loaded for TZDB time-zone rules version: ", str2));
                }
            }
            z12 = true;
        }
        return z12;
    }

    public final String toString() {
        return "TZDB";
    }
}
