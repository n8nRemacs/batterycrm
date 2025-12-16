package dn0;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.adapter.analytic.ReviewPageFrom;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.squareup.anvil.annotations.ContributesBinding;
import en0.C40134a;
import en0.C40135b;
import en0.C40136c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReviewGalleryAnalyticsInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldn0/b;", "Ldn0/a;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: dn0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39765b implements InterfaceC39764a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f394053a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f394054b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f394055c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f394056d;

    @Inject
    public C39765b(@k InterfaceC28373a interfaceC28373a, @k E e12, @l @com.avito.android.review_gallery.di.b String str, @com.avito.android.review_gallery.di.a @k String str2) {
        this.f394053a = interfaceC28373a;
        this.f394054b = e12;
        this.f394055c = str;
        this.f394056d = str2;
    }

    @Override // dn0.InterfaceC39764a
    public final void a(@l Long l12) {
        this.f394053a.c(new C40136c(this.f394054b.a(), l12));
    }

    @Override // dn0.InterfaceC39764a
    public final void b(int i12, @l Long l12) {
        this.f394053a.c(new C40135b(i12, l12, this.f394054b.a(), this.f394056d));
    }

    @Override // dn0.InterfaceC39764a
    public final void c(int i12, @l Long l12) {
        ReviewPageFrom[] reviewPageFromArr = ReviewPageFrom.f68398b;
        this.f394053a.c(new N3.b(i12, l12, AdvertDetailsBlockIdKt.GALLERY_BLOCK, null));
    }

    @Override // dn0.InterfaceC39764a
    public final void d() {
        this.f394053a.c(new C40134a(this.f394054b.a(), this.f394055c));
    }
}
