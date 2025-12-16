package com.avito.beduin.v2.engine.field.entity;

import java.util.Locale;
import kotlin.Metadata;

/* compiled from: MutableField.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/r;", "", "a", "b", "c", "Lcom/avito/beduin/v2/engine/field/entity/r$b;", "Lcom/avito/beduin/v2/engine/field/entity/r$c;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f336823a = a.f336824a;

    /* compiled from: MutableField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/r$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f336824a = new a();

        @Y61.k
        public static r a(@Y61.k String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            r rVar = b.f336825b;
            rVar.getClass();
            if (!lowerCase.equals(b.f336826c)) {
                rVar = c.f336827b;
                rVar.getClass();
                if (!lowerCase.equals(c.f336828c)) {
                    throw new IllegalArgumentException(AK.c.k("MutationFormat ", str, " not found"));
                }
            }
            return rVar;
        }
    }

    /* compiled from: MutableField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/r$b;", "Lcom/avito/beduin/v2/engine/field/entity/r;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements r {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f336825b = new b();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f336826c = "FinalData".toLowerCase(Locale.ROOT);

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2086518310;
        }

        @Y61.k
        public final String toString() {
            return "FinalData";
        }
    }

    /* compiled from: MutableField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/r$c;", "Lcom/avito/beduin/v2/engine/field/entity/r;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements r {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f336827b = new c();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f336828c = "LiveData".toLowerCase(Locale.ROOT);

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2027251216;
        }

        @Y61.k
        public final String toString() {
            return "LiveData";
        }
    }
}
