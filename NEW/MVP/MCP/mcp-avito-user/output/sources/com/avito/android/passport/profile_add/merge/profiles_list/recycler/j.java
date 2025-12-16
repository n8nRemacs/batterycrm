package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MergeAccountsExpandItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/i;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f213323d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f213324b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f213325c;

    public j(@Y61.k View view) {
        super(view);
        this.f213324b = view;
        this.f213325c = (TextView) view.findViewById(R.id.passport_merge_accounts_profile_list_expand);
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f213324b.setOnClickListener(new C(18, aVar));
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.i
    public final void eS(int i12) throws Resources.NotFoundException {
        String quantityString = this.f213324b.getResources().getQuantityString(R.plurals.passport_accounts_merge_profiles_extra, i12, Integer.valueOf(i12));
        TextView textView = this.f213325c;
        textView.setText(quantityString);
        FV.a.f4720a.f(textView, R.attr.textIconArrowDownIos, y6.b(4));
    }

    @Override // com.avito.android.passport.profile_add.merge.profiles_list.recycler.i
    public final void em() throws Resources.NotFoundException {
        String string = this.f213324b.getResources().getString(R.string.passport_accounts_merge_profiles_collapse);
        TextView textView = this.f213325c;
        textView.setText(string);
        FV.a.f4720a.f(textView, R.attr.textIconArrowUpIos, y6.b(4));
    }
}
