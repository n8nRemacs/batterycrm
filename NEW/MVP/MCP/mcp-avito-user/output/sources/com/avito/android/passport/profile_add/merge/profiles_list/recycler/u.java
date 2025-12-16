package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MergeAccountsProfileItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/u;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/t;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f213340e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f213341b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f213342c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f213343d;

    public u(@Y61.k View view) {
        super(view);
        this.f213341b = view;
        this.f213342c = (TextView) view.findViewById(R.id.passport_merge_accounts_profile_list_item_title);
        this.f213343d = (SimpleDraweeView) view.findViewById(R.id.passport_merge_accounts_profile_list_item_avatar);
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.t
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f213341b.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(13, aVar));
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.t
    public final void setTitle(@Y61.k String str) {
        this.f213342c.setText(str);
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.t
    public final void z5(@Y61.l com.avito.android.image_loader.k kVar) {
        C35949t5.c(this.f213343d, kVar, null, null, null, 14);
    }
}
