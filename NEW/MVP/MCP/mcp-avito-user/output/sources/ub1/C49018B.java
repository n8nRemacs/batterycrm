package ub1;

import android.content.Context;
import android.content.Intent;
import kotlin.G0;
import kotlin.Z;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: ub1.B, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49018B extends N implements Y41.l<ru.rustore.sdk.reactive.single.p<G0>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f440123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReviewInfo f440124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49018B(E e12, ReviewInfo reviewInfo) {
        super(1);
        this.f440123l = e12;
        this.f440124m = reviewInfo;
    }

    @Override // Y41.l
    public final G0 invoke(ru.rustore.sdk.reactive.single.p<G0> pVar) {
        Object bVar;
        ru.rustore.sdk.reactive.single.p<G0> pVar2 = pVar;
        E e12 = this.f440123l;
        ReviewInfo reviewInfo = this.f440124m;
        try {
            int i12 = Z.f406624c;
            Context context = e12.f440129a;
            Intent intent = new Intent("ru.vk.store.RequestAppReview");
            intent.putExtra("KEY_APPLICATION_ID", e12.f440130b);
            intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
            ru.rustore.sdk.activitylauncher.e.a(context, intent, new i(pVar2));
            bVar = G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            pVar2.a(thB);
        }
        return G0.f406611a;
    }
}
