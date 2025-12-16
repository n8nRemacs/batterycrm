package com.avito.android.paranja;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParanjaManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/paranja/m;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/paranja/m$a;", "Lcom/avito/android/paranja/m$b;", "Lcom/avito/android/paranja/m$c;", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class m {

    /* compiled from: ParanjaManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/paranja/m$a;", "Lcom/avito/android/paranja/m;", "<init>", "()V", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f210909a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2106736899;
        }

        @Y61.k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ParanjaManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paranja/m$b;", "Lcom/avito/android/paranja/m;", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RectF f210910a;

        public b(@Y61.k RectF rectF) {
            super(null);
            this.f210910a = rectF;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f210910a, ((b) obj).f210910a);
        }

        public final int hashCode() {
            return this.f210910a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Show(rect=" + this.f210910a + ')';
        }
    }

    /* compiled from: ParanjaManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/paranja/m$c;", "Lcom/avito/android/paranja/m;", "<init>", "()V", "_avito_paranja_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f210911a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2107040757;
        }

        @Y61.k
        public final String toString() {
            return "Stop";
        }
    }

    public /* synthetic */ m(C42822w c42822w) {
        this();
    }

    public m() {
    }
}
