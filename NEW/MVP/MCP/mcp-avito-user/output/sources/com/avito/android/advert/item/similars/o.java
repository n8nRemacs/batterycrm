package com.avito.android.advert.item.similars;

import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.section.SectionTypeElement;
import java.util.HashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ComplementaryInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.similars.ComplementaryInteractorImpl$getComplementaryByIds$2", f = "ComplementaryInteractor.kt", i = {}, l = {63, 57, 74, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super List<? extends SectionTypeElement>>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Boolean f80309A;

    /* renamed from: q, reason: collision with root package name */
    public fa.d f80310q;

    /* renamed from: r, reason: collision with root package name */
    public String f80311r;

    /* renamed from: s, reason: collision with root package name */
    public HashMap f80312s;

    /* renamed from: t, reason: collision with root package name */
    public String f80313t;

    /* renamed from: u, reason: collision with root package name */
    public int f80314u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsStyle f80315v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f80316w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List<String> f80317x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f80318y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f80319z;

    /* compiled from: ComplementaryInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AdvertDetailsStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle = AdvertDetailsStyle.f84409c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle2 = AdvertDetailsStyle.f84409c;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AdvertDetailsStyle advertDetailsStyle3 = AdvertDetailsStyle.f84409c;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AdvertDetailsStyle advertDetailsStyle, q qVar, List<String> list, String str, String str2, Boolean bool, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f80315v = advertDetailsStyle;
        this.f80316w = qVar;
        this.f80317x = list;
        this.f80318y = str;
        this.f80319z = str2;
        this.f80309A = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f80315v, this.f80316w, this.f80317x, this.f80318y, this.f80319z, this.f80309A, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends SectionTypeElement>> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
