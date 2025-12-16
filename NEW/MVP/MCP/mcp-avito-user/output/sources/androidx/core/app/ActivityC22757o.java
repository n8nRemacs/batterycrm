package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.collection.o1;
import androidx.core.view.C22838q;
import androidx.view.C22985S;
import androidx.view.FragmentC23058q0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import j.InterfaceC42153i;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\u0019\u0010\u000bR.\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R\u001a\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0005R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/core/app/o;", "Landroid/app/Activity;", "Landroidx/lifecycle/P;", "Landroidx/core/view/q$a;", "<init>", "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/KeyEvent;", "event", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Landroidx/collection/o1;", "Ljava/lang/Class;", "Landroidx/core/app/o$a;", "extraDataMap", "Landroidx/collection/o1;", "getExtraDataMap$annotations", "Landroidx/lifecycle/S;", "lifecycleRegistry", "Landroidx/lifecycle/S;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "a", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.core.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC22757o extends Activity implements InterfaceC22983P, C22838q.a {

    @Y61.k
    private final o1<Class<? extends a>, a> extraDataMap = new o1<>(0, 1, null);

    @Y61.k
    private final C22985S lifecycleRegistry = new C22985S(this, true);

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/o$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC42830m
    @RestrictTo
    /* renamed from: androidx.core.app.o$a */
    public static class a {
    }

    private final boolean shouldSkipDump(String[] args) {
        if (args == null || args.length == 0) {
            return false;
        }
        String str = args[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    public void A0() {
        onBackPressed();
    }

    public void H() {
        onBackPressed();
    }

    public void R() {
        finish();
    }

    public void R0() {
        finish();
    }

    public void close() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@Y61.k KeyEvent event) {
        View decorView = getWindow().getDecorView();
        if (C22838q.a(decorView, event)) {
            return true;
        }
        return C22838q.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@Y61.k KeyEvent event) {
        if (C22838q.a(getWindow().getDecorView(), event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public void e4() {
        finish();
    }

    @Y61.k
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(@Y61.l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentC23058q0.f46869c.getClass();
        FragmentC23058q0.b.b(this);
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    public void onSaveInstanceState(@Y61.k Bundle outState) {
        this.lifecycleRegistry.h(Lifecycle.State.f46681d);
        super.onSaveInstanceState(outState);
    }

    public final boolean shouldDumpInternalState(@Y61.l String[] args) {
        return !shouldSkipDump(args);
    }

    @Override // androidx.core.view.C22838q.a
    @RestrictTo
    public boolean superDispatchKeyEvent(@Y61.k KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public void t0() {
        finish();
    }

    public void u0() {
        finish();
    }
}
