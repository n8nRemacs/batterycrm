package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationsSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsActor$toggleChange$1", f = "NotificationsSettingsActor.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {59, 62, 64}, m = "invokeSuspend", n = {"$this$flow", "section", "$this$flow", "section", "channel", "$this$flow", "section"}, s = {"L$0", "L$5", "L$0", "L$5", "L$7", "L$0", "L$5"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super NotificationsSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ NotificationsSettingsToggleItem f208100A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ e f208101B;

    /* renamed from: q, reason: collision with root package name */
    public NotificationsSettingsToggleItem f208102q;

    /* renamed from: r, reason: collision with root package name */
    public NotificationsSettingsState f208103r;

    /* renamed from: s, reason: collision with root package name */
    public e f208104s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f208105t;

    /* renamed from: u, reason: collision with root package name */
    public NotificationsSettings.Section f208106u;

    /* renamed from: v, reason: collision with root package name */
    public Iterator f208107v;

    /* renamed from: w, reason: collision with root package name */
    public NotificationsSettings.Section.Channel f208108w;

    /* renamed from: x, reason: collision with root package name */
    public int f208109x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f208110y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ NotificationsSettingsState f208111z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationsSettingsState notificationsSettingsState, NotificationsSettingsToggleItem notificationsSettingsToggleItem, e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f208111z = notificationsSettingsState;
        this.f208100A = notificationsSettingsToggleItem;
        this.f208101B = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f208111z, this.f208100A, this.f208101B, continuation);
        cVar.f208110y = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super NotificationsSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007b -> B:43:0x0145). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a9 -> B:41:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c9 -> B:41:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0137 -> B:41:0x013e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.screen.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
