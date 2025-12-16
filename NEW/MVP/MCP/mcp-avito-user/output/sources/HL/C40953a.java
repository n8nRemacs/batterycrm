package hl;

import Y61.k;
import com.avito.android.activeOrders.ItemType;
import com.avito.android.activeOrders.e;
import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.di.module.InterfaceC30235x5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wI.C49514a;

/* compiled from: ObserveActiveOrdersUpdatesUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhl/a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40953a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f397378a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49514a f397379b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final I3.a f397380c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f397381d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BxContentArguments f397382e;

    /* compiled from: ObserveActiveOrdersUpdatesUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11273a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f397383a;

        static {
            int[] iArr = new int[ItemType.values().length];
            try {
                iArr[ItemType.GOODS_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemType.SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f397383a = iArr;
        }
    }

    @Inject
    public C40953a(@k e eVar, @k C49514a c49514a, @k I3.a aVar, @InterfaceC30235x5 boolean z12, @k BxContentArguments bxContentArguments) {
        this.f397378a = eVar;
        this.f397379b = c49514a;
        this.f397380c = aVar;
        this.f397381d = z12;
        this.f397382e = bxContentArguments;
    }
}
