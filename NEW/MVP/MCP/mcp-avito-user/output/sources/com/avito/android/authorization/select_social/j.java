package com.avito.android.authorization.select_social;

import java.util.List;
import kotlin.Metadata;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;", "items", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f94538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f94539c;

    public j(n nVar, s sVar) {
        this.f94538b = nVar;
        this.f94539c = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.konveyor.util.a.a(this.f94538b.f94545b, (List) obj);
        this.f94539c.f94576d.notifyDataSetChanged();
    }
}
