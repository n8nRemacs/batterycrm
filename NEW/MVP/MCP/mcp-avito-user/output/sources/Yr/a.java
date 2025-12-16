package YR;

import Y61.k;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.google.android.material.shape.q;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wK0.AbstractC49528c;

/* compiled from: BaseExceptionComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"LYR/a;", "State", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/lib/design/text_view/a;", "a", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a<State> extends AbstractC36333c<State, com.avito.android.lib.design.text_view.a> {

    /* renamed from: m, reason: collision with root package name */
    public final int f19474m;

    /* compiled from: BaseExceptionComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LYR/a$a;", "", "<init>", "()V", "", "BACKGROUND_RADUIS", "I", "HORIZONTAL_PADDING", "VERTICAL_PADDING", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: YR.a$a, reason: collision with other inner class name */
    public static final class C1379a {
        public /* synthetic */ C1379a(C42822w c42822w) {
            this();
        }

        public C1379a() {
        }
    }

    static {
        new C1379a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@e0 int i12) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f19474m = i12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new com.avito.android.lib.design.text_view.a(viewGroup.getContext(), null, R.attr.textM10, 0, 8, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void l(@k com.avito.android.lib.design.text_view.a aVar, @k com.avito.beduin.v2.theme.k kVar, State state) {
        aVar.setText(this.f19474m);
        aVar.setPadding(y6.b(16), y6.b(20), y6.b(16), y6.b(20));
        AbstractC49528c.a aVar2 = AbstractC49528c.f441377b;
        aVar2.getClass();
        q.b bVarF = AbstractC49528c.a.a().f();
        bVarF.c(y6.b(20));
        q qVarA = bVarF.a();
        TypedValue typedValue = new TypedValue();
        aVar.getContext().getTheme().resolveAttribute(R.attr.warmGray4, typedValue, true);
        aVar.setBackground(AbstractC49528c.a.b(aVar2, qVarA, 0, 0, 0, 0, ColorStateList.valueOf(typedValue.data), null, null, null, 478));
        aVar.setTextIsSelectable(false);
    }
}
