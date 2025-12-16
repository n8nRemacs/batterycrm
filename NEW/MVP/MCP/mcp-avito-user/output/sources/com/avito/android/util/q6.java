package com.avito.android.util;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ViewGroups.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/q6;", "", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q6 implements Iterable<View>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f318983b;

    public q6(ViewGroup viewGroup) {
        this.f318983b = viewGroup;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<View> iterator() {
        return new p6(this.f318983b);
    }
}
