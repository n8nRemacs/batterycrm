package hT;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.beduin_v2.feature.di.V0;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2SendV1ActionsClient.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhT/a;", "Lcom/avito/beduin/v2/interaction/send_v1_action/a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@V0
/* renamed from: hT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40874a implements com.avito.beduin.v2.interaction.send_v1_action.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f397202a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49066a f397203b;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hT.a$a, reason: collision with other inner class name */
    public static final class C11259a extends com.google.gson.reflect.a<List<? extends BeduinAction>> {
    }

    @Inject
    public C40874a(@k Gson gson, @k InterfaceC49066a interfaceC49066a) {
        this.f397202a = gson;
        this.f397203b = interfaceC49066a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.avito.beduin.v2.interaction.send_v1_action.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.beduin.v2.interaction.send_v1_action.e[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L39
            r2 = r8[r1]
            java.lang.String r3 = r2.f337837b
            hT.a$a r4 = new hT.a$a
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L23
            r5 = r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            boolean r6 = com.avito.android.util.R1.a(r5)
            if (r6 == 0) goto L23
            java.lang.reflect.Type r4 = r5.getRawType()
            goto L27
        L23:
            java.lang.reflect.Type r4 = com.avito.android.util.R1.b(r4)
        L27:
            com.google.gson.Gson r5 = r7.f397202a
            java.lang.Object r3 = r5.e(r3, r4)
            java.util.List r3 = (java.util.List) r3
            java.lang.String r2 = r2.f337836a
            uj.a r4 = r7.f397203b
            r4.a(r2, r3)
            int r1 = r1 + 1
            goto L2
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hT.C40874a.a(com.avito.beduin.v2.interaction.send_v1_action.e[]):void");
    }
}
