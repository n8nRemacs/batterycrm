package t31;

import Y41.l;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.MasterKey;
import cc1.C27176a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Z;

/* loaded from: classes8.dex */
public final class c implements nc1.b, F41.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f439139a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f439140b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f439141c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f439142d;

    public c(Context context) {
        Object bVar;
        this.f439139a = context;
        try {
            int i12 = Z.f406624c;
            MasterKey.d dVar = new MasterKey.d(context);
            dVar.b();
            bVar = dVar.a();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        this.f439140b = bVar;
        this.f439141c = nc1.a.a(this, this.f439139a, 0, new b(this));
        this.f439142d = C42727D.c(C48496a.f439137l);
    }

    @Override // nc1.b
    public final SharedPreferences a(Context context, int i12, Y41.a aVar) {
        return nc1.a.a(this, context, i12, aVar);
    }

    public final void b(l lVar) {
        String string;
        InterfaceC42726C interfaceC42726C = this.f439142d;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) interfaceC42726C.getValue()).readLock();
        lock.lock();
        SharedPreferences sharedPreferences = this.f439141c;
        Long lValueOf = null;
        if (sharedPreferences != null) {
            try {
                string = sharedPreferences.getString("sber_id_session_id", null);
            } finally {
            }
        } else {
            string = null;
        }
        lock.unlock();
        if (string == null) {
            string = "";
        }
        ((ReentrantReadWriteLock) interfaceC42726C.getValue()).readLock().lock();
        if (sharedPreferences != null) {
            try {
                lValueOf = Long.valueOf(sharedPreferences.getLong("sber_id_session_expires_at", 0L));
            } finally {
            }
        }
        lVar.invoke(new C27176a(string, lValueOf != null ? lValueOf.longValue() : 0L));
    }

    public final void c(C27176a c27176a) {
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutLong;
        String id2 = c27176a.getId();
        long expiresTime = c27176a.getExpiresTime();
        InterfaceC42726C interfaceC42726C = this.f439142d;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) interfaceC42726C.getValue();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        SharedPreferences sharedPreferences = this.f439141c;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (editorEdit != null && (editorPutString = editorEdit.putString("sber_id_session_id", id2)) != null) {
                    editorPutString.apply();
                    G0 g02 = G0.f406611a;
                }
            } finally {
            }
        }
        for (int i14 = 0; i14 < readHoldCount; i14++) {
            lock.lock();
        }
        writeLock.unlock();
        ReentrantReadWriteLock reentrantReadWriteLock2 = (ReentrantReadWriteLock) interfaceC42726C.getValue();
        lock = reentrantReadWriteLock2.readLock();
        readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
        for (int i15 = 0; i15 < readHoldCount; i15++) {
            lock.unlock();
        }
        writeLock = reentrantReadWriteLock2.writeLock();
        writeLock.lock();
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                if (editorEdit2 != null && (editorPutLong = editorEdit2.putLong("sber_id_session_expires_at", expiresTime)) != null) {
                    editorPutLong.apply();
                    G0 g03 = G0.f406611a;
                }
            } finally {
            }
        }
        while (i12 < readHoldCount) {
            lock.lock();
            i12++;
        }
        writeLock.unlock();
    }
}
