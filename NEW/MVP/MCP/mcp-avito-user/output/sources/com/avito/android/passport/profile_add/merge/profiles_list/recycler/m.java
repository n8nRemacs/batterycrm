package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MergeAccountsProfileItem.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/m;", "LTV0/b;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/t;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/o;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements TV0.b<t, o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f213330a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<u> f213331b = new g.a<>(R.layout.passport_merge_accounts_profiles_list_item, a.f213332l);

    /* compiled from: MergeAccountsProfileItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/u;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, u> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f213332l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final u invoke(ViewGroup viewGroup, View view) {
            return new u(view);
        }
    }

    @Inject
    public m(@Y61.k p pVar) {
        this.f213330a = pVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f213330a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<u> b() {
        return this.f213331b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof o;
    }
}
