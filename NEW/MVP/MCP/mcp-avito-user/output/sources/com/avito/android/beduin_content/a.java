package com.avito.android.beduin_content;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import j.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinSerpItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin_content/a;", "LTV0/b;", "Lcom/avito/android/beduin_content/e;", "Lcom/avito/android/beduin_content/BeduinSerpItem;", "a", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<e, BeduinSerpItem> {

    /* renamed from: d, reason: collision with root package name */
    @I
    public static final int f105223d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f105224a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.adapter.b f105225b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f105226c = new g.a<>(f105223d, new b(this));

    /* compiled from: BeduinSerpItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_content/a$a;", "", "<init>", "()V", "", "BEDUIN_SERP_LAYOUT_ID", "I", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_content.a$a, reason: collision with other inner class name */
    public static final class C3143a {
        public /* synthetic */ C3143a(C42822w c42822w) {
            this();
        }

        public C3143a() {
        }
    }

    static {
        new C3143a(null);
        f105223d = R.layout.item_beduin_serp;
    }

    public a(@k d dVar, @k com.avito.android.beduin.common.component.adapter.b bVar) {
        this.f105224a = dVar;
        this.f105225b = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105224a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f105226c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BeduinSerpItem;
    }
}
