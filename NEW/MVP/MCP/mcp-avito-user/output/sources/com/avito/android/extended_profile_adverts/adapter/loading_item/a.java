package com.avito.android.extended_profile_adverts.adapter.loading_item;

import Y61.k;
import com.avito.android.serp.adapter.i1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PageLoadingItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/loading_item/a;", "Lcom/avito/android/serp/adapter/i1;", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements i1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f150583b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f150584c;

    /* compiled from: PageLoadingItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/loading_item/a$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_adverts.adapter.loading_item.a$a, reason: collision with other inner class name */
    public static final class C4402a {
        public /* synthetic */ C4402a(C42822w c42822w) {
            this();
        }

        public C4402a() {
        }
    }

    static {
        new C4402a(null);
    }

    public a(int i12, String str, int i13, C42822w c42822w) {
        str = (i13 & 2) != 0 ? "loading_item" : str;
        this.f150583b = i12;
        this.f150584c = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124046b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF150583b() {
        return this.f150583b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF150584c() {
        return this.f150584c;
    }
}
