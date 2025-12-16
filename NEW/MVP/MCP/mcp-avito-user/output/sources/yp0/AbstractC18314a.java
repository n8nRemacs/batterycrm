package Yp0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaginationEventAction.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LYp0/a;", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "a", "b", "LYp0/a$a;", "LYp0/a$b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18314a implements com.avito.conveyor_item.a {

    /* compiled from: PaginationEventAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYp0/a$a;", "LYp0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yp0.a$a, reason: collision with other inner class name */
    public static final class C1404a extends AbstractC18314a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19692b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f19693c;

        public C1404a(@k String str) {
            super(null);
            this.f19692b = str;
            this.f19693c = "pagination_error";
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF19693c() {
            return this.f19693c;
        }
    }

    /* compiled from: PaginationEventAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYp0/a$b;", "LYp0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yp0.a$b */
    public static final class b extends AbstractC18314a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f19694b = new b();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f19695c = "pagination_loading_error";

        public b() {
            super(null);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId */
        public final String getF19693c() {
            return f19695c;
        }
    }

    public /* synthetic */ AbstractC18314a(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162200b() {
        return getF19693c().hashCode();
    }

    public AbstractC18314a() {
    }
}
