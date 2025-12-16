package yA0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.SxAddAddressSource;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;

/* compiled from: SxAddressIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LyA0/c;", "", "a", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yA0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50095c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f442964a = a.f442965a;

    /* compiled from: SxAddressIntentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyA0/c$a;", "", "<init>", "()V", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yA0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f442965a = new a();
    }

    @k
    Intent a(@k Context context, long j12, @l String str, @l String str2);

    @k
    Intent b(@k Context context);

    @k
    Intent c(@k Context context, @l String str, @k String str2, long j12, long j13, @k Coordinates coordinates, @l String str3, @k String str4, @k SxAddAddressSource sxAddAddressSource);

    @k
    Intent d(@k Context context, long j12);

    @k
    Intent e(@k Context context, long j12, @l String str);

    @k
    Intent f(@k Context context, @l String str, long j12, long j13, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource);
}
