package com.avito.android.vas_performance.ui.items.competitive_vas;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CompetitiveVasItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/d;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321621b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321622c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f321623d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f321624e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f321625f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f321626g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f321627h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Object f321628i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f321629j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f321630k;

    public d(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @l Image image, @l Image image2, @k List list, boolean z12, boolean z13) {
        this.f321621b = str;
        this.f321622c = str2;
        this.f321623d = str3;
        this.f321624e = str4;
        this.f321625f = str5;
        this.f321626g = image;
        this.f321627h = image2;
        this.f321628i = list;
        this.f321629j = z12;
        this.f321630k = z13;
    }

    @Override // TV0.a
    public final long getId() {
        return getF317767b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317767b() {
        return this.f321621b;
    }
}
