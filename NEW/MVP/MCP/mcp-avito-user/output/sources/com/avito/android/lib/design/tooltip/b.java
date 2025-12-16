package com.avito.android.lib.design.tooltip;

import kotlin.Metadata;

/* compiled from: AnchorPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/tooltip/b;", "", "<init>", "()V", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: AnchorPosition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/b$b;", "Lcom/avito/android/lib/design/tooltip/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.tooltip.b$b, reason: collision with other inner class name */
    public static final class C5327b implements com.avito.android.lib.design.tooltip.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public Integer f181188a;

        @Override // com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            if (this.f181188a == null) {
                this.f181188a = Integer.valueOf(aVar.f9481q);
            }
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            Integer num = this.f181188a;
            return i13 - (num != null ? num.intValue() : 0);
        }
    }

    /* compiled from: AnchorPosition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/b$c;", "Lcom/avito/android/lib/design/tooltip/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements com.avito.android.lib.design.tooltip.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public Integer f181189a;

        @Override // com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            if (this.f181189a == null) {
                this.f181189a = Integer.valueOf(aVar.f9481q);
            }
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            Integer num = this.f181189a;
            return i12 + (num != null ? num.intValue() : 0);
        }
    }

    static {
        new b();
    }

    /* compiled from: AnchorPosition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/b$a;", "Lcom/avito/android/lib/design/tooltip/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.tooltip.a {
        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return androidx.appcompat.app.r.f(i13, i12, 2, i12);
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
        }
    }
}
