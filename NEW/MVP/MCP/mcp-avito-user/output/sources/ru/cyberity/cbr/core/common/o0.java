package ru.cyberity.cbr.core.common;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommonExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/common/o0;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "d", "Lru/cyberity/cbr/core/common/o0$a;", "Lru/cyberity/cbr/core/common/o0$b;", "Lru/cyberity/cbr/core/common/o0$c;", "Lru/cyberity/cbr/core/common/o0$d;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String text;

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/o0$a;", "Lru/cyberity/cbr/core/common/o0;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends o0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f432813b = new a();

        private a() {
            super("NFC disabled", null);
        }
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/o0$b;", "Lru/cyberity/cbr/core/common/o0;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends o0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f432814b = new b();

        private b() {
            super("NFC enabled", null);
        }
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/cyberity/cbr/core/common/o0$c;", "Lru/cyberity/cbr/core/common/o0;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends o0 {
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/core/common/o0$d;", "Lru/cyberity/cbr/core/common/o0;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends o0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f432815b = new d();

        private d() {
            super("Device has no NFC onboard", null);
        }
    }

    public /* synthetic */ o0(String str, C42822w c42822w) {
        this(str);
    }

    private o0(String str) {
        this.text = str;
    }
}
