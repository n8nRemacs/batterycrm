package com.avito.android.select.sectioned_multiselect.core;

import Xp0.AbstractC17036a;
import Yp0.AbstractC18314a;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34662l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC17036a f266673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f266674c;

    public C34662l(AbstractC17036a abstractC17036a, K k12) {
        this.f266673b = abstractC17036a;
        this.f266674c = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        AbstractC17036a.C1350a c1350a = AbstractC17036a.C1350a.f19075a;
        AbstractC17036a abstractC17036a = this.f266673b;
        boolean zF2 = kotlin.jvm.internal.L.f(abstractC17036a, c1350a) ? true : kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.b.f19076a);
        K k12 = this.f266674c;
        if (zF2) {
            k12.k(new AbstractC18314a.C1404a(k12.f266480e.f266514a.getString(R.string.pagination_error_action_repeat)));
        } else if (kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.c.f19077a)) {
            ApiError apiErrorA = k12.f266485j.a(th2);
            C34656f c34656f = k12.f266489n;
            if (c34656f != null) {
                c34656f.f266653n.c(null, new C34657g(com.avito.android.select.D.a(apiErrorA), c34656f));
            }
        }
        V2.f318762a.a("DEFAULT_TAG", "Failed to load page", th2);
    }
}
