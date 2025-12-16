package com.avito.android.memory.consumption;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TrackedMemoryScope.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/memory/consumption/m;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/memory/consumption/m$a;", "Lcom/avito/android/memory/consumption/m$b;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class m {

    /* compiled from: TrackedMemoryScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/memory/consumption/m$a;", "Lcom/avito/android/memory/consumption/m;", "<init>", "()V", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f186137a = new a();

        public a() {
            super(null);
        }

        @Override // com.avito.android.memory.consumption.m
        @Y61.k
        /* renamed from: a */
        public final String getF186138a() {
            return "entire_app";
        }
    }

    /* compiled from: TrackedMemoryScope.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/m$b;", "Lcom/avito/android/memory/consumption/m;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f186138a;

        public b(@Y61.k String str) {
            super(null);
            this.f186138a = str;
        }

        @Override // com.avito.android.memory.consumption.m
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF186138a() {
            return this.f186138a;
        }
    }

    public /* synthetic */ m(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract String getF186138a();

    public m() {
    }
}
