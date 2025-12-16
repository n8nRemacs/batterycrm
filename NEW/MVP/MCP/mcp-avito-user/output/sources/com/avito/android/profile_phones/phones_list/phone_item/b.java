package com.avito.android.profile_phones.phones_list.phone_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.profile_phones.phones_list.PhoneItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneListItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/phone_item/b;", "LTV0/b;", "Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItemView;", "Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItem;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<PhoneListItemView, PhoneListItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f228153a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<PhoneListItemView> f228154b = new g.a<>(R.layout.phone_list_item, a.f228155l);

    /* compiled from: PhoneListItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_phones/phones_list/phone_item/PhoneListItemView;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, PhoneListItemView> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228155l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final PhoneListItemView invoke(ViewGroup viewGroup, View view) {
            return new PhoneListItemView((PhoneItem) view);
        }
    }

    public b(@k c cVar) {
        this.f228153a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f228153a;
    }

    @Override // TV0.b
    @k
    public final g.a<PhoneListItemView> b() {
        return this.f228154b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PhoneListItem;
    }
}
