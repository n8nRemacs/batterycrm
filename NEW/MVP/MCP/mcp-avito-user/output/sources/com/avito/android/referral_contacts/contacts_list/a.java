package com.avito.android.referral_contacts.contacts_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/contacts_list/a;", "LTV0/b;", "Lcom/avito/android/referral_contacts/contacts_list/c;", "Lcom/avito/android/referral_contacts/contacts_list/ContactItem;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<c, ContactItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f252400a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<c> f252401b = new g.a<>(R.layout.contact_list_item, C7575a.f252402l);

    /* compiled from: ContactItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/referral_contacts/contacts_list/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/referral_contacts/contacts_list/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.referral_contacts.contacts_list.a$a, reason: collision with other inner class name */
    public static final class C7575a extends N implements p<ViewGroup, View, c> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7575a f252402l = new C7575a();

        public C7575a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f252400a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f252400a;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f252401b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ContactItem;
    }
}
