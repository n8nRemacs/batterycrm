package com.akita.compose.component.chips.internal;

import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: MultiLineLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/chips/internal/c;", "", "chips_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f60906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f60908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f60909d;

    public c(int i12, @Y61.k ArrayList arrayList) {
        this.f60906a = arrayList;
        this.f60907b = i12;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f60908c = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f60909d = C42727D.b(lazyThreadSafetyMode, new a(this));
    }
}
