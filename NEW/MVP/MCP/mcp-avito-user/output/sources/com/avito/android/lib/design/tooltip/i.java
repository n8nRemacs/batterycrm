package com.avito.android.lib.design.tooltip;

import com.avito.android.lib.design.tooltip.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TailPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/tooltip/i;", "", "<init>", "()V", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* compiled from: TailPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/i$a;", "Lcom/avito/android/lib/design/tooltip/c;", "Lcom/avito/android/lib/design/tooltip/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.lib.design.tooltip.c implements com.avito.android.lib.design.tooltip.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.tooltip.a f181208b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            return androidx.appcompat.app.r.f(i13, i12, 2, i12);
        }

        @Override // com.avito.android.lib.design.tooltip.c, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181208b.e(aVar);
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181208b.f(i12, i13);
        }

        public /* synthetic */ a(com.avito.android.lib.design.tooltip.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new b.a() : aVar);
        }

        public a(@Y61.k com.avito.android.lib.design.tooltip.a aVar) {
            this.f181208b = aVar;
        }
    }

    /* compiled from: TailPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/i$b;", "Lcom/avito/android/lib/design/tooltip/c;", "Lcom/avito/android/lib/design/tooltip/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.tooltip.c implements com.avito.android.lib.design.tooltip.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.tooltip.a f181209b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Integer f181210c;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            int iA2 = i13 - a();
            Integer num = this.f181210c;
            int iIntValue = iA2 - (num != null ? num.intValue() : 0);
            return iIntValue <= i13 ? iIntValue : androidx.appcompat.app.r.f(i13, i12, 2, i12);
        }

        @Override // com.avito.android.lib.design.tooltip.c, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181209b.e(aVar);
            if (this.f181210c == null) {
                this.f181210c = Integer.valueOf(aVar.f9478n);
            }
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181209b.f(i12, i13);
        }

        public /* synthetic */ b(com.avito.android.lib.design.tooltip.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new b.a() : aVar);
        }

        public b(@Y61.k com.avito.android.lib.design.tooltip.a aVar) {
            this.f181209b = aVar;
        }
    }

    /* compiled from: TailPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/i$c;", "Lcom/avito/android/lib/design/tooltip/c;", "Lcom/avito/android/lib/design/tooltip/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.avito.android.lib.design.tooltip.c implements com.avito.android.lib.design.tooltip.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.lib.design.tooltip.a f181211b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Integer f181212c;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            int iA2 = a() + i12;
            Integer num = this.f181212c;
            int iIntValue = iA2 + (num != null ? num.intValue() : 0);
            return iIntValue <= i13 ? iIntValue : androidx.appcompat.app.r.f(i13, i12, 2, i12);
        }

        @Override // com.avito.android.lib.design.tooltip.c, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181211b.e(aVar);
            if (this.f181212c == null) {
                this.f181212c = Integer.valueOf(aVar.f9478n);
            }
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181211b.f(i12, i13);
        }

        public /* synthetic */ c(com.avito.android.lib.design.tooltip.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new b.c() : aVar);
        }

        public c(@Y61.k com.avito.android.lib.design.tooltip.a aVar) {
            this.f181211b = aVar;
        }
    }

    static {
        new i();
    }
}
