package vE0;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimestampConfig.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LvE0/b;", "", "a", "b", "LvE0/b$a;", "LvE0/b$b;", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC49202b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440546a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49204d f440547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f440548c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440549d;

    /* compiled from: TimestampConfig.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvE0/b$a;", "LvE0/b;", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vE0.b$a */
    public static final class a extends AbstractC49202b {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AbstractC12751b.a f440550e;

        public a(String str, C49204d c49204d, boolean z12, AbstractC12751b.a aVar, int i12, C42822w c42822w) {
            super(str, c49204d, (i12 & 4) != 0 ? false : z12, false, 8, null);
            this.f440550e = aVar;
        }
    }

    /* compiled from: TimestampConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LvE0/b$b;", "LvE0/b;", "a", "b", "LvE0/b$b$a;", "LvE0/b$b$b;", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vE0.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC12751b extends AbstractC49202b {

        /* compiled from: TimestampConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvE0/b$b$a;", "LvE0/b$b;", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vE0.b$b$a */
        public static final class a extends AbstractC12751b {

            /* renamed from: e, reason: collision with root package name */
            @k
            public final C49204d f440551e;

            public a(String str, C49204d c49204d, boolean z12, boolean z13, C49204d c49204d2, int i12, C42822w c42822w) {
                super(str, c49204d, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13, null);
                this.f440551e = c49204d2;
            }
        }

        /* compiled from: TimestampConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvE0/b$b$b;", "LvE0/b$b;", "_avito_timestamp-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: vE0.b$b$b, reason: collision with other inner class name */
        public static final class C12752b extends AbstractC12751b {
            public C12752b(String str, C49204d c49204d, boolean z12, boolean z13, int i12, C42822w c42822w) {
                super(str, c49204d, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13, null);
            }
        }

        public /* synthetic */ AbstractC12751b(String str, C49204d c49204d, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(str, c49204d, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13, null);
        }

        public AbstractC12751b(String str, C49204d c49204d, boolean z12, boolean z13, C42822w c42822w) {
            super(str, c49204d, z12, z13, null);
        }
    }

    public /* synthetic */ AbstractC49202b(String str, C49204d c49204d, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, c49204d, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? true : z13, null);
    }

    public AbstractC49202b(String str, C49204d c49204d, boolean z12, boolean z13, C42822w c42822w) {
        this.f440546a = str;
        this.f440547b = c49204d;
        this.f440548c = z12;
        this.f440549d = z13;
    }
}
