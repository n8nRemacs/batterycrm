package x31;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import d31.C39498d;
import d31.C39499e;
import e.InterfaceC39835a;
import java.net.SocketException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import sberid.sdk.app_token.domain.models.models.TypeAuth;
import sberid.sdk.global.models.StandName;
import sberid.sdk.init.a;

/* loaded from: classes8.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.h f442148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f442149m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f442150n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g0.h hVar, String str, Uri uri) {
        super(0);
        this.f442148l = hVar;
        this.f442149m = str;
        this.f442150n = uri;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final Object invoke() throws SocketException {
        N41.f fVar;
        g0.h hVar = this.f442148l;
        ((C39498d) hVar.f396208f0.getValue()).a(this.f442149m);
        a.d dVar = a.d.f437775a;
        ActivityC22955m activityC22955mRequireActivity = hVar.requireActivity();
        dVar.getClass();
        Ob1.a aVar = a.d.f437776b;
        if (aVar == null) {
            Ob1.a aVar2 = new Ob1.a(StandName.f437764e);
            InterfaceC39835a interfaceC39835a = (InterfaceC39835a) a.d.f437778d.getValue();
            int i12 = d31.h.f393656a[4];
            if (i12 == 1) {
                fVar = N41.c.f11190b;
            } else if (i12 == 2) {
                fVar = N41.e.f11192b;
            } else if (i12 == 3) {
                fVar = N41.c.f11190b;
            } else if (i12 == 4) {
                fVar = N41.e.f11192b;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = N41.d.f11191b;
            }
            e.h hVar2 = (e.h) interfaceC39835a;
            hVar2.getClass();
            C43259k.d((T) ((D31.g) hVar2.f394228a).f2880a.getValue(), null, null, new e.e(hVar2, fVar, null), 3);
            a.d.f437776b = aVar2;
            aVar = aVar2;
        }
        Uri uri = this.f442150n;
        aVar.f12418a = uri.getQueryParameter(VoiceInfo.STATE);
        aVar.f12419b = uri.getQueryParameter("nonce");
        aVar.f12420c = TypeAuth.f437744d;
        aVar.b(activityC22955mRequireActivity, aVar.a(uri));
        Eb1.d dVar2 = (Eb1.d) aVar.f12421d.getValue();
        if (!dVar2.a()) {
            B81.k kVar = (B81.k) dVar2.f4104c.f443385a;
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) kVar.f912e.getValue();
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i13 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i14 = 0; i14 < readHoldCount; i14++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                SharedPreferences sharedPreferences = kVar.f911d;
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove("sber_id_app_token").apply();
                    editorEdit.apply();
                    G0 g02 = G0.f406611a;
                }
            } finally {
                while (i13 < readHoldCount) {
                    lock.lock();
                    i13++;
                }
                writeLock.unlock();
            }
        }
        ((C39499e) aVar.f12423f.getValue()).c(aVar.f12420c);
        hVar.dismiss();
        return G0.f406611a;
    }
}
