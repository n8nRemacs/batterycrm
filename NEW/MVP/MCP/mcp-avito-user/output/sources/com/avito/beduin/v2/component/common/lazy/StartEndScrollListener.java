package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StartEndScrollListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$r;", "<init>", "()V", "ScrollType", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StartEndScrollListener extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @l
    public N f335671b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public N f335672c;

    /* renamed from: d, reason: collision with root package name */
    public int f335673d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ScrollType f335674e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StartEndScrollListener.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/StartEndScrollListener$ScrollType;", "", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScrollType {

        /* renamed from: b, reason: collision with root package name */
        public static final ScrollType f335675b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScrollType f335676c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ScrollType[] f335677d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335678e;

        static {
            ScrollType scrollType = new ScrollType("MANUAL", 0);
            f335675b = scrollType;
            ScrollType scrollType2 = new ScrollType("SYSTEM", 1);
            f335676c = scrollType2;
            ScrollType[] scrollTypeArr = {scrollType, scrollType2};
            f335677d = scrollTypeArr;
            f335678e = kotlin.enums.c.a(scrollTypeArr);
        }

        public ScrollType() {
            throw null;
        }

        public static ScrollType valueOf(String str) {
            return (ScrollType) Enum.valueOf(ScrollType.class, str);
        }

        public static ScrollType[] values() {
            return (ScrollType[]) f335677d.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        ?? r02;
        int i13;
        boolean z12 = false;
        boolean z13 = i12 == 1 && this.f335673d == 0;
        boolean z14 = i12 == 2 && this.f335673d == 0;
        if (i12 == 0 && ((i13 = this.f335673d) == 1 || i13 == 2)) {
            z12 = true;
        }
        if (z13) {
            ScrollType scrollType = ScrollType.f335675b;
            ?? r03 = this.f335671b;
            if (r03 != 0) {
                r03.invoke(scrollType);
            }
            this.f335674e = scrollType;
        } else if (z14) {
            ScrollType scrollType2 = ScrollType.f335676c;
            ?? r04 = this.f335671b;
            if (r04 != 0) {
                r04.invoke(scrollType2);
            }
            this.f335674e = scrollType2;
        } else if (z12) {
            ScrollType scrollType3 = this.f335674e;
            if (scrollType3 != null && (r02 = this.f335672c) != 0) {
                r02.invoke(scrollType3);
            }
            this.f335674e = null;
        }
        this.f335673d = i12;
    }
}
