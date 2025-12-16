package com.google.firebase.crashlytics.internal.metadata;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.firebase.crashlytics.internal.common.C37586h;
import com.google.firebase.crashlytics.internal.metadata.j;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f361063c;

    public /* synthetic */ i(Object obj, int i12) {
        this.f361062b = i12;
        this.f361063c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.lang.String] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Closeable closeable;
        boolean z12;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        Map mapUnmodifiableMap;
        BufferedWriter bufferedWriter3;
        switch (this.f361062b) {
            case 0:
                j jVar = (j) this.f361063c;
                synchronized (jVar.f361069f) {
                    try {
                        closeable = null;
                        z12 = false;
                        if (jVar.f361069f.isMarked()) {
                            String reference = jVar.f361069f.getReference();
                            jVar.f361069f.set(reference, false);
                            z12 = true;
                            bufferedWriter = reference;
                        } else {
                            bufferedWriter = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z12) {
                    File fileC = jVar.f361064a.f361039a.c(jVar.f361066c, "user-data");
                    try {
                        try {
                            d dVar = new d();
                            dVar.put(ChannelContext.Item.USER_ID, bufferedWriter);
                            String string = dVar.toString();
                            bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), e.f361038b));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                bufferedWriter = bufferedWriter2;
                            } catch (Exception unused) {
                                com.google.firebase.crashlytics.internal.d.f361031a.a(5);
                                bufferedWriter = bufferedWriter2;
                                C37586h.a(bufferedWriter);
                                return null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = bufferedWriter;
                            C37586h.a(closeable);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        bufferedWriter2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        C37586h.a(closeable);
                        throw th;
                    }
                    C37586h.a(bufferedWriter);
                }
                return null;
            default:
                j.a aVar = (j.a) this.f361063c;
                BufferedWriter bufferedWriter4 = null;
                aVar.f361071b.set(null);
                synchronized (aVar) {
                    if (aVar.f361070a.isMarked()) {
                        b reference2 = aVar.f361070a.getReference();
                        synchronized (reference2) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference2.f361032a));
                        }
                        AtomicMarkableReference<b> atomicMarkableReference = aVar.f361070a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapUnmodifiableMap = null;
                    }
                }
                if (mapUnmodifiableMap != null) {
                    j jVar2 = aVar.f361073d;
                    e eVar = jVar2.f361064a;
                    String str = jVar2.f361066c;
                    File fileC2 = aVar.f361072c ? eVar.f361039a.c(str, "internal-keys") : eVar.f361039a.c(str, "keys");
                    try {
                        String string2 = new JSONObject(mapUnmodifiableMap).toString();
                        bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC2), e.f361038b));
                        try {
                            try {
                                bufferedWriter3.write(string2);
                                bufferedWriter3.flush();
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedWriter4 = bufferedWriter3;
                                C37586h.a(bufferedWriter4);
                                throw th;
                            }
                        } catch (Exception unused3) {
                            com.google.firebase.crashlytics.internal.d.f361031a.a(5);
                            e.d(fileC2);
                            C37586h.a(bufferedWriter3);
                            return null;
                        }
                    } catch (Exception unused4) {
                        bufferedWriter3 = null;
                    } catch (Throwable th6) {
                        th = th6;
                        C37586h.a(bufferedWriter4);
                        throw th;
                    }
                    C37586h.a(bufferedWriter3);
                }
                return null;
        }
    }
}
