package com.avito.beduin.v2.avito.component.baseSelect.state;

import Y61.k;
import com.avito.beduin.v2.avito.component.text.state.n;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.h;
import com.avito.beduin.v2.theme.o;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: AvitoBaseSelectStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/baseSelect/state/f;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/baseSelect/state/a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends o<a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f333871b = new f();

    public f() {
        super("BaseSelect");
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new a(g12.getString("themeName"), f333871b.c(g12), h.a(g12, "height", b.f333867b), h.c(g12, "textStyle", n.f335362b), s.b(g12, "textColor"), s.b(g12, "disabledTextColor"), s.b(g12, "errorTextColor"), s.b(g12, "warningTextColor"), s.b(g12, "placeholderColor"), s.b(g12, "disabledPlaceholderColor"), s.b(g12, "errorPlaceholderColor"), s.b(g12, "warningPlaceholderColor"), s.b(g12, "backgroundColor"), s.b(g12, "errorBackgroundColor"), s.b(g12, "warningBackgroundColor"), s.b(g12, "disabledBackgroundColor"), h.a(g12, "borderWidth", c.f333868b), s.b(g12, "borderColor"), s.b(g12, "errorBorderColor"), s.b(g12, "warningBorderColor"), s.b(g12, "disabledBorderColor"), s.b(g12, "iconStartColor"), s.b(g12, "errorIconStartColor"), s.b(g12, "warningIconStartColor"), s.b(g12, "disabledIconStartColor"), s.b(g12, "iconEndColor"), s.b(g12, "errorIconEndColor"), s.b(g12, "warningIconEndColor"), s.b(g12, "disabledIconEndColor"), h.c(g12, "spinnerStyle", com.avito.beduin.v2.avito.component.spinner.state.k.f335151b), s.b(g12, "errorSpinnerColor"), s.b(g12, "warningSpinnerColor"), s.b(g12, "disabledSpinnerColor"), h.a(g12, "cornerRadius", d.f333869b), h.a(g12, "maxLines", e.f333870b));
    }
}
