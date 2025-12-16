package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bud;
import defpackage.dj6;
import defpackage.eo7;
import defpackage.h54;
import defpackage.hs;
import defpackage.i54;
import defpackage.li6;
import defpackage.ln;
import defpackage.ti6;
import defpackage.tk4;
import defpackage.u45;
import defpackage.ue0;
import defpackage.vid;
import defpackage.yy7;
import defpackage.z8a;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.messages.location.FrgLocationMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ yy7[] o = {new z8a(FragmentWrapperWidget.class, "fragmentId", "getFragmentId()I"), u45.h(vid.a, FragmentWrapperWidget.class, "fragmentClass", "getFragmentClass()Ljava/lang/String;"), new z8a(FragmentWrapperWidget.class, "fragmentTag", "getFragmentTag()Ljava/lang/String;"), new z8a(FragmentWrapperWidget.class, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;")};
    public final hs a;
    public final hs b;
    public final hs c;
    public final hs d;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentWrapperWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new hs(Integer.class, "widget:fragment:id");
        Class<String> cls = String.class;
        this.b = new hs(cls, ":widget:fragment:class");
        this.c = new hs(cls, "widget:fragment:tag");
        this.d = new hs(Bundle.class, "widget:fragment:args");
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getB() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        a aVarZ0 = z0();
        if (aVarZ0 != null) {
            aVarZ0.L(getContext());
        }
    }

    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        ti6 ti6VarY0;
        a aVarZ0;
        if (i54Var.b || (ti6VarY0 = y0()) == null || (aVarZ0 = z0()) == null) {
            return;
        }
        ue0 ue0Var = new ue0(ti6VarY0);
        ue0Var.h(aVarZ0);
        ue0Var.d(true);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object objPrevious;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        yy7[] yy7VarArr = o;
        yy7 yy7Var = yy7VarArr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        ti6 ti6VarY0 = y0();
        if (ti6VarY0 != null) {
            a aVarC = ti6VarY0.C(frameLayout.getId());
            yy7 yy7Var2 = yy7VarArr[1];
            String str = (String) this.b.a(this);
            if (aVarC == null) {
                li6 li6VarH = ti6VarY0.H();
                frameLayout.getContext().getClassLoader();
                aVarC = li6VarH.a(str);
                int i = aVarC.H0;
                aVarC.H0 = i;
                aVarC.I0 = i;
                aVarC.J0 = aVarC.J0;
                aVarC.D0 = ti6VarY0;
                aVarC.E0 = ti6VarY0.w;
                yy7 yy7Var3 = yy7VarArr[3];
                aVarC.n0((Bundle) this.d.a(this));
                frameLayout.getContext();
                aVarC.V(null, bundle);
                ue0 ue0Var = new ue0(ti6VarY0);
                ue0Var.o = true;
                yy7 yy7Var4 = yy7VarArr[2];
                String str2 = (String) this.c.a(this);
                aVarC.R0 = frameLayout;
                aVarC.z0 = true;
                ue0Var.f(frameLayout.getId(), aVarC, str2, 1);
                if (ue0Var.g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                ue0Var.q.A(ue0Var, true);
            }
            FrgLocationMap frgLocationMap = aVarC instanceof FrgLocationMap ? (FrgLocationMap) aVarC : null;
            if (frgLocationMap != null) {
                ArrayList arrayListE = getRouter().e();
                ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    if (((bud) objPrevious).a instanceof dj6) {
                        break;
                    }
                }
                bud budVar = (bud) objPrevious;
                Object obj = budVar != null ? budVar.a : null;
                frgLocationMap.u1 = obj instanceof dj6 ? (dj6) obj : null;
            }
            View view = aVarC.S0;
            if (view != null && view.getParent() == null) {
                aVarC.R0 = frameLayout;
                e eVarG = ti6VarY0.g(aVarC);
                eVarG.b();
                eVarG.k();
            }
        }
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroy() {
        a aVarZ0 = z0();
        if (aVarZ0 != null) {
            aVarZ0.P();
        }
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        a aVarZ0 = z0();
        if (aVarZ0 != null) {
            aVarZ0.Q();
        }
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        a aVarZ0 = z0();
        if (aVarZ0 != null) {
            aVarZ0.R();
        }
    }

    public final ti6 y0() {
        Activity activity = getActivity();
        ln lnVar = activity instanceof ln ? (ln) activity : null;
        if (lnVar != null) {
            return lnVar.z();
        }
        return null;
    }

    public final a z0() {
        ti6 ti6VarY0 = y0();
        if (ti6VarY0 == null) {
            return null;
        }
        yy7 yy7Var = o[0];
        return ti6VarY0.C(((Number) this.a.a(this)).intValue());
    }

    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, tk4 tk4Var) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        hs hsVar = this.a;
        yy7[] yy7VarArr = o;
        yy7 yy7Var = yy7VarArr[0];
        hsVar.b(this, Integer.valueOf(i));
        String name = cls.getName();
        hs hsVar2 = this.b;
        yy7 yy7Var2 = yy7VarArr[1];
        hsVar2.b(this, name);
        hs hsVar3 = this.c;
        yy7 yy7Var3 = yy7VarArr[2];
        hsVar3.b(this, str);
        hs hsVar4 = this.d;
        yy7 yy7Var4 = yy7VarArr[3];
        hsVar4.b(this, bundle);
    }
}
