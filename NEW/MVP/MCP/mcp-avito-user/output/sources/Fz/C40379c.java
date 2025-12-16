package fZ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.date_time_formatter.o;
import com.avito.android.messenger.channels.mvi.list_feature.q1;
import com.avito.android.remote.model.messenger.message.StatusCode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsSearchResultConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfZ/c;", "LfZ/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40379c implements InterfaceC40378b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q1 f395941a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f395942b;

    /* compiled from: ChannelsSearchResultConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fZ.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f395943a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.SENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f395943a = iArr;
        }
    }

    @Inject
    public C40379c(@k q1 q1Var, @k o oVar) {
        this.f395941a = q1Var;
        this.f395942b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // fZ.InterfaceC40378b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.lang.String r27, @Y61.k java.util.ArrayList r28) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fZ.C40379c.a(java.lang.String, java.util.ArrayList):java.util.ArrayList");
    }
}
