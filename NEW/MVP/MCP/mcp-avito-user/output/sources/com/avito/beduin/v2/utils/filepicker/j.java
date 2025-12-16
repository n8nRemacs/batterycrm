package com.avito.beduin.v2.utils.filepicker;

import com.avito.beduin.v2.client.permission.PermissionDeniedException;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.interaction.flow.file_picker.flow.j;
import com.avito.beduin.v2.interaction.repository.flow.C36328a;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ScreenAwareFilePickerClient.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j.a f338446l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j.a aVar) {
        super(1);
        this.f338446l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        A aB2;
        Throwable th3 = th2;
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (3 >= RU0.b.f14469c) {
            RU0.b.f14468b.e(RU0.b.f14470d + ":FilePicker", "Manifest.permission.CAMERA is denied");
        }
        j.a aVar = this.f338446l;
        aVar.getClass();
        boolean z12 = th3 instanceof PermissionDeniedException;
        InterfaceC36238a interfaceC36238a = aVar.f337428a;
        if (z12) {
            String[] strArr = ((PermissionDeniedException) th3).f335467b;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(str.length() > 0 ? interfaceC36238a.c().e(C43066x.n0('.', str, str)) : com.avito.beduin.v2.engine.field.entity.f.f336800b);
            }
            aB2 = new A(new Q("error", new A(new Q("permissions_denied", new C36268a(arrayList)))));
        } else {
            aB2 = C36328a.b(th3, interfaceC36238a.c());
        }
        int i12 = Z.f406624c;
        aVar.f337429b.resumeWith(new Q(null, aB2));
        return G0.f406611a;
    }
}
