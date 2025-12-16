package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.o;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "uploadStatusInfo", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f194970b;

    public t(o oVar) {
        this.f194970b = oVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aW;
        o.b bVar = (o.b) obj;
        boolean z12 = bVar instanceof o.b.C5761b;
        o oVar = this.f194970b;
        if (z12) {
            o.b.C5761b c5761b = (o.b.C5761b) bVar;
            int i12 = o.f194952f;
            oVar.getClass();
            AbstractC32094s0.b bVar2 = c5761b.f194961a;
            C41811b c41811bG = oVar.f194954b.I(bVar2.f191222b, bVar2.f191223c, bVar2.f191221a, bVar2.f191224d, c5761b.f194963c.getETag()).g(com.avito.android.messenger.conversation.mvi.file_attachment.y.a(oVar.f194955c, c5761b.f194962b, "ChunkedVideoUploadWorkerDelegate"));
            boolean zBooleanValue = oVar.f194957e.w().invoke().booleanValue();
            String str = bVar2.f191221a;
            String str2 = bVar2.f191223c;
            MessengerUserHashInfo messengerUserHashInfo = bVar2.f191222b;
            InterfaceC32024m interfaceC32024m = oVar.f194954b;
            if (zBooleanValue) {
                abstractC41768aW = c41811bG.g(interfaceC32024m.Z(str2, str, messengerUserHashInfo).o(new q(c5761b, oVar)));
            } else {
                long j12 = bVar2.f191225e;
                abstractC41768aW = (j12 <= 1 || bVar2.f191224d != j12) ? c41811bG.g(C41823n.f402260b) : c41811bG.g(interfaceC32024m.Z(str2, str, messengerUserHashInfo).o(new p(oVar)));
            }
        } else {
            if (!(bVar instanceof o.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = o.f194952f;
            oVar.getClass();
            AbstractC32094s0.b bVar3 = ((o.b.a) bVar).f194958a;
            abstractC41768aW = oVar.f194954b.W(bVar3.f191222b, bVar3.f191223c, bVar3.f191221a, bVar3.f191224d);
        }
        return abstractC41768aW.l(new s(oVar)).r();
    }
}
