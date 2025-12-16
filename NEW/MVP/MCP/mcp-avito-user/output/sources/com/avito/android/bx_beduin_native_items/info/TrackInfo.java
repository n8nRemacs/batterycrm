package com.avito.android.bx_beduin_native_items.info;

import Gk.InterfaceC13892b;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TrackInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/TrackInfo;", "Landroid/os/Parcelable;", "a", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TrackInfo extends Parcelable {

    /* renamed from: P1, reason: collision with root package name */
    @k
    public static final a f108839P1 = a.f108840a;

    /* compiled from: TrackInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bx_beduin_native_items/info/TrackInfo$a;", "", "<init>", "()V", "_avito_bx-beduin-native-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f108840a = new a();
    }

    /* compiled from: TrackInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void D0(long j12);

    @l
    InterfaceC13892b F1();

    @k
    TrackInfo S4(long j12);

    void U1(@k C43238h c43238h, long j12, @k b.InterfaceC10495b interfaceC10495b, int i12, @k InterfaceC13892b interfaceC13892b);

    void a6(@l InterfaceC13892b interfaceC13892b);

    boolean m1();

    void onDestroyView();

    @k
    Class<Object> r4();
}
