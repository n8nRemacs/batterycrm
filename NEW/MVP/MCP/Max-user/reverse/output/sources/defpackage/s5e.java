package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* loaded from: classes2.dex */
public final class s5e extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ SearchMessageBottomWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5e(View view, SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.X = view;
        this.Y = searchMessageBottomWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s5e s5eVar = (s5e) l((g7e) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s5eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s5e s5eVar = new s5e(this.X, this.Y, continuation);
        s5eVar.o = obj;
        return s5eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        g7e g7eVar = (g7e) this.o;
        boolean z = g7eVar instanceof c7e;
        this.X.setVisibility(z ? 0 : 8);
        if (!(g7eVar instanceof d7e) && !(g7eVar instanceof e7e)) {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            c7e c7eVar = (c7e) g7eVar;
            yy7[] yy7VarArr = SearchMessageBottomWidget.Z;
            SearchMessageBottomWidget searchMessageBottomWidget = this.Y;
            AppCompatTextView appCompatTextViewZ0 = searchMessageBottomWidget.z0();
            Context context = searchMessageBottomWidget.getContext();
            int i = c7eVar.a;
            boolean z2 = c7eVar.d;
            boolean z3 = c7eVar.c;
            appCompatTextViewZ0.setText(i == 0 ? context.getString(n1b.f) : context.getString(n1b.g, Integer.valueOf(c7eVar.b), Integer.valueOf(i)));
            searchMessageBottomWidget.X = z3;
            searchMessageBottomWidget.D0(searchMessageBottomWidget.B0(), z3);
            searchMessageBottomWidget.Y = z2;
            searchMessageBottomWidget.D0(searchMessageBottomWidget.y0(), z2);
        }
        return qqg.a;
    }
}
