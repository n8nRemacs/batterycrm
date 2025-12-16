package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import arrow.core.C23703n1;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.persistence.messenger.C33136x2;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.maybe.C41921o;
import io.reactivex.rxjava3.internal.operators.maybe.C41930y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;
import ru.avito.messenger.api.entity.MultipartUploadPart;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/w;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/w;", "com/avito/android/util/rx3/Q0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class F0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f191016e;

    public F0(AbstractC32094s0.a aVar, C32104x0 c32104x0, com.jakewharton.rxrelay3.c cVar, AtomicBoolean atomicBoolean) {
        this.f191013b = c32104x0;
        this.f191014c = aVar;
        this.f191015d = atomicBoolean;
        this.f191016e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse;
        C32092r0 c32092r0;
        io.reactivex.rxjava3.core.q<T> qVarZ;
        String str;
        String str2;
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return new C41930y(new IllegalStateException("No metainfo found for this video message"));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        kotlin.Q q12 = (kotlin.Q) ((C23703n1) y02).f56288b;
        Q1 q13 = (Q1) q12.f406619b;
        List<C33136x2> list = (List) q12.f406620c;
        int i12 = C32104x0.f191321p;
        C32104x0 c32104x0 = this.f191013b;
        c32104x0.getClass();
        String str3 = null;
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse2 = (q13.f215289h == null || (str = q13.f215290i) == null || (str2 = q13.f215292k) == null) ? null : new CreateChunkedVideoFileResponse(q13.f215289h, str, str2, null);
        String str4 = q13.f215286e;
        if (str4 == null || C43066x.K(str4) || q13.f215293l <= 0 || q13.f215294m <= 0) {
            createChunkedVideoFileResponse = createChunkedVideoFileResponse2;
            c32092r0 = null;
        } else {
            createChunkedVideoFileResponse = createChunkedVideoFileResponse2;
            c32092r0 = new C32092r0(new File(str4), q13.f215295n, q13.f215296o, "application/octet-stream", q13.f215297p, q13.f215293l, q13.f215294m);
        }
        ArrayList arrayList = new ArrayList();
        for (C33136x2 c33136x2 : list) {
            String str5 = c33136x2.f215579i;
            MultipartUploadPart multipartUploadPart = str5 != null ? new MultipartUploadPart(c33136x2.f215574d, str5) : null;
            if (multipartUploadPart != null) {
                arrayList.add(multipartUploadPart);
            }
        }
        AbstractC32094s0.a aVar = this.f191014c;
        com.jakewharton.rxrelay3.c cVar = this.f191016e;
        AtomicBoolean atomicBoolean = this.f191015d;
        InterfaceC47842z interfaceC47842z = c32104x0.f191324c;
        String str6 = aVar.f191220c;
        if (createChunkedVideoFileResponse == null) {
            C30277e1 c30277e1 = c32104x0.f191326e;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[45];
            String str7 = ((Boolean) c30277e1.f144983S.a().invoke()).booleanValue() ? q13.f215299r : null;
            String str8 = q13.f215295n;
            if (str8 != null && !C43066x.K(str8)) {
                str3 = str8;
            }
            if (str3 == null) {
                str3 = "video";
            }
            io.reactivex.rxjava3.core.I iD2 = interfaceC47842z.d(str6, str3, str7);
            H0 h02 = new H0(this.f191013b, aVar, q13, cVar, atomicBoolean);
            iD2.getClass();
            qVarZ = new io.reactivex.rxjava3.internal.operators.single.D<>(iD2, h02);
        } else if (q13.f215288g == TransferStatus.SUCCESS) {
            qVarZ = com.avito.android.util.rx3.A.a(new InterfaceC32098u0.a.b(createChunkedVideoFileResponse.getFileId(), createChunkedVideoFileResponse.getVideoId()));
        } else {
            com.avito.android.messenger.conversation.mvi.file_attachment.n nVar2 = c32104x0.f191323b;
            if (c32092r0 == null) {
                String str9 = q13.f215285d;
                if (str9 == null || C43066x.K(str9)) {
                    return new C41921o(new C41930y(new IllegalStateException("Original file URI not found for this video message")), c32104x0.f191332k.b(aVar.f191219b, aVar.f191220c, aVar.f191218a, q13, false));
                }
                Uri uri = Uri.parse(str9);
                boolean z12 = c32104x0.f191336o;
                String str10 = q13.f215300s;
                qVarZ = ((!z12 || q13.f215298q) ? c32104x0.d(uri, str10).r(Q0.f191086b) : nVar2.a().n(new P0(c32104x0, uri, str10))).o(new R0(c32104x0, createChunkedVideoFileResponse, aVar)).g(new C41826q(new I0(aVar, c32104x0, cVar, atomicBoolean))).z();
            } else {
                CreateChunkedVideoFileResponse createChunkedVideoFileResponse3 = createChunkedVideoFileResponse;
                if (!arrayList.isEmpty() && arrayList.size() == ((int) c32092r0.f191212g)) {
                    AbstractC41768a abstractC41768aO = interfaceC47842z.c(createChunkedVideoFileResponse3.getVideoId(), createChunkedVideoFileResponse3.getFileId(), createChunkedVideoFileResponse3.getUploadSessionId(), arrayList).o(new B0(c32104x0, c32092r0, createChunkedVideoFileResponse3, aVar));
                    InterfaceC32024m interfaceC32024m = c32104x0.f191322a;
                    MessengerUserHashInfo messengerUserHashInfo = aVar.f191219b;
                    String str11 = aVar.f191218a;
                    return new C41921o(com.avito.android.util.rx3.A.a(new InterfaceC32098u0.a.b(createChunkedVideoFileResponse3.getFileId(), createChunkedVideoFileResponse3.getVideoId())), abstractC41768aO.g(interfaceC32024m.V(str6, str11, messengerUserHashInfo)).g(interfaceC32024m.G(str6, str11, messengerUserHashInfo).r()));
                }
                AbstractC32094s0.b bVar = new AbstractC32094s0.b(aVar.f191218a, aVar.f191219b, aVar.f191220c, arrayList.size() + 1, c32092r0.f191212g);
                AbstractC41768a abstractC41768aA = c32104x0.f191332k.a(bVar);
                long j12 = bVar.f191225e;
                File file = c32092r0.f191206a;
                qVarZ = abstractC41768aA.h((j12 > 1 ? nVar2.s(file, (bVar.f191224d - 1) * 5242880) : nVar2.h(file).r(new W0(c32092r0))).n(new d1(bVar, c32104x0, createChunkedVideoFileResponse3, c32092r0, atomicBoolean))).o(new K0(aVar, c32104x0, cVar, atomicBoolean)).z();
            }
        }
        return qVarZ;
    }
}
