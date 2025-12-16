package B81;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.MasterKey;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Z;
import kotlin.text.C43066x;
import kotlinx.serialization.json.AbstractC43443a;

/* loaded from: classes9.dex */
public final class k implements nc1.b, uc1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f908a;

    /* renamed from: b, reason: collision with root package name */
    public final h f909b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f910c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f911d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC42726C f912e;

    public k(Context context, h hVar) {
        Object bVar;
        this.f908a = context;
        this.f909b = hVar;
        try {
            int i12 = Z.f406624c;
            MasterKey.d dVar = new MasterKey.d(context);
            dVar.b();
            bVar = dVar.a();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        this.f910c = bVar;
        this.f911d = nc1.a.a(this, this.f908a, 0, new j(this));
        this.f912e = C42727D.c(i.f906l);
    }

    @Override // nc1.b
    public final SharedPreferences a(Context context, int i12, Y41.a aVar) {
        return nc1.a.a(this, context, i12, aVar);
    }

    public final void b(Kb1.b bVar) {
        Object bVar2;
        Object bVar3;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        Ib1.a aVar = new Ib1.a(bVar.getToken(), bVar.getCreateTime(), bVar.getTypeAuth());
        try {
            int i12 = Z.f406624c;
            AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
            c11757a.getClass();
            bVar2 = c11757a.c(Ib1.a.INSTANCE.serializer(), aVar);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar2 = new Z.b(th2);
        }
        boolean z12 = bVar2 instanceof Z.b;
        if (z12) {
            bVar2 = null;
        }
        String str = (String) bVar2;
        if (z12 || str == null) {
            Ib1.a.class.toString();
            aVar.toString();
        }
        if (str == null) {
            try {
                bVar3 = Dc1.c.f3297a.l(aVar);
            } catch (Throwable th3) {
                int i14 = Z.f406624c;
                bVar3 = new Z.b(th3);
            }
            boolean z13 = bVar3 instanceof Z.b;
            str = (String) (z13 ? null : bVar3);
            if (z13 || str == null) {
                Ib1.a.class.toString();
                aVar.toString();
            }
            if (str == null) {
                str = "";
            }
        }
        if (C43066x.K(str)) {
            return;
        }
        bVar.toString();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f912e.getValue();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i15 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i16 = 0; i16 < readHoldCount; i16++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            SharedPreferences sharedPreferences = this.f911d;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("sber_id_app_token", str)) != null) {
                editorPutString.apply();
                G0 g02 = G0.f406611a;
            }
        } finally {
            while (i15 < readHoldCount) {
                lock.lock();
                i15++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Kb1.b c() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B81.k.c():Kb1.b");
    }

    public final void d() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f912e.getValue();
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i12 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i13 = 0; i13 < readHoldCount; i13++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            SharedPreferences sharedPreferences = this.f911d;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("sber_id_app_token_has_called", true)) != null) {
                editorPutBoolean.apply();
                G0 g02 = G0.f406611a;
            }
        } finally {
            while (i12 < readHoldCount) {
                lock.lock();
                i12++;
            }
            writeLock.unlock();
        }
    }
}
