package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final /* synthetic */ class C43121u extends kotlin.jvm.internal.H implements Y41.p<Long, C<Object>, C<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C43121u f410996b = new C43121u();

    public C43121u() {
        super(2, C43122v.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // Y41.p
    public final C<Object> invoke(Long l12, C<Object> c12) {
        long jLongValue = l12.longValue();
        C<Object> c13 = c12;
        C<Object> c14 = C43122v.f411002a;
        return new C<>(jLongValue, c13, c13.f410782f, 0);
    }
}
