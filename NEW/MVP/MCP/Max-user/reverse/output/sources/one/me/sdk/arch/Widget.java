package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ari;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bgh;
import defpackage.bud;
import defpackage.c54;
import defpackage.c83;
import defpackage.c9a;
import defpackage.cm6;
import defpackage.cqi;
import defpackage.dqi;
import defpackage.dse;
import defpackage.e3i;
import defpackage.em6;
import defpackage.eo7;
import defpackage.f82;
import defpackage.fni;
import defpackage.g2i;
import defpackage.g56;
import defpackage.gw0;
import defpackage.h2i;
import defpackage.h54;
import defpackage.ha3;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i2i;
import defpackage.i54;
import defpackage.ipd;
import defpackage.ipi;
import defpackage.j2i;
import defpackage.j48;
import defpackage.jzc;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k8j;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.ln;
import defpackage.m2i;
import defpackage.m54;
import defpackage.mg8;
import defpackage.n2i;
import defpackage.o2i;
import defpackage.p2i;
import defpackage.p54;
import defpackage.qqg;
import defpackage.qt7;
import defpackage.rn0;
import defpackage.sm6;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.u7g;
import defpackage.ue3;
import defpackage.uif;
import defpackage.v17;
import defpackage.v38;
import defpackage.vq9;
import defpackage.wfh;
import defpackage.wqi;
import defpackage.wy1;
import defpackage.x26;
import defpackage.xfh;
import defpackage.ytd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import one.me.sdk.arch.internal.BinderNotFoundValueException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002£\u0001\b&\u0018\u0000 Â\u00012\u00020\u0001:\u0003cÃ\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b,\u0010+J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u000e\b\b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103J?\u00109\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u0006\u00105\u001a\u0002042\u0010\b\n\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108J;\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0/H\u0001¢\u0006\u0004\b>\u0010?JG\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\u0006\u00105\u001a\u0002042\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0001¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010C*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000H\"\b\b\u0000\u0010G*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\b\b\u0000\u0010G*\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0004¢\u0006\u0004\bN\u0010OJ=\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020R0H2\b\b\u0001\u0010P\u001a\u00020\u00042\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0012\u0018\u00010QH\u0004¢\u0006\u0004\bT\u0010UJ%\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020V0H2\b\b\u0001\u0010P\u001a\u00020\u0004H\u0004¢\u0006\u0004\bW\u0010JJ#\u0010[\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u0002042\b\b\u0002\u0010X\u001a\u00020\u0000H\u0000¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u0002H\u0015¢\u0006\u0004\b]\u0010\u0014J\u0017\u0010_\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0002H\u0014¢\u0006\u0004\b_\u0010\u0014J\u0019\u0010a\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\ba\u0010bJ#\u0010g\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u0002042\b\b\u0002\u0010d\u001a\u00020cH\u0000¢\u0006\u0004\be\u0010fJS\u0010o\u001a\u00020n\"\u0004\b\u0000\u0010G*\b\u0012\u0004\u0012\u00028\u00000h2\b\b\u0002\u0010j\u001a\u00020i2$\b\u0004\u0010m\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120l\u0012\u0006\u0012\u0004\u0018\u00010K0kH\u0084\bø\u0001\u0000¢\u0006\u0004\bo\u0010pJ.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00028\u0000H\u0084\b¢\u0006\u0004\b\u0003\u0010uJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010r\u001a\u00020qH\u0084\b¢\u0006\u0004\b\u0003\u0010vJ)\u0010x\u001a\u00020\u00122\u0014\b\u0004\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120QH\u0084\bø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u0004\u0018\u00010z¢\u0006\u0004\b{\u0010|J\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0081\u0001\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\u0001H\u0002¢\u0006\u0005\b\u0081\u0001\u0010bR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0082\u0001R \u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R-\u0010\u008a\u0001\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u00105\u001a\u0002048VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009d\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010¡\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\"\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u0012\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010\u00ad\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b«\u0001\u0010\u008f\u0001\u001a\u0005\b¬\u0001\u0010|R\u0015\u0010±\u0001\u001a\u00030®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0015\u0010µ\u0001\u001a\u00030²\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010¹\u0001\u001a\u00030¶\u00018F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0015\u0010»\u0001\u001a\u00030²\u00018F¢\u0006\b\u001a\u0006\bº\u0001\u0010´\u0001R.\u0010Á\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ä\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Lc54;", "Landroid/os/Bundle;", "args", "", "layoutRes", "<init>", "(Landroid/os/Bundle;I)V", "Lln;", "requireActivity", "()Lln;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "Landroid/content/res/Resources;", "requireResources", "()Landroid/content/res/Resources;", "newArgs", "Lqqg;", "updateArgs", "(Landroid/os/Bundle;)V", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedViewState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;)V", "Lh54;", "changeHandler", "Li54;", "changeType", "onChangeStarted", "(Lh54;Li54;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lxfh;", "VM", "Lkotlin/Function0;", "vmProducer", "Lk18;", "viewModel", "(Lcm6;)Lk18;", "Lb1e;", "scopeId", "defaultFactory", "sharedViewModel-qk3jasM", "(Ljava/lang/String;Lcm6;)Lk18;", "sharedViewModel", "Ljava/lang/Class;", "viewModelClass", "Lwfh;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Lcm6;)Lk18;", "getSharedViewModel-cp94BC8", "(Ljava/lang/String;Ljava/lang/Class;Lcm6;)Lk18;", "getSharedViewModel", "V", "id", "findViewById", "(I)Landroid/view/View;", "T", "Lbbd;", "viewBinding", "(I)Lbbd;", "", "bindAction", "Lsn0;", "binding", "(Lcm6;)Lsn0;", "containerId", "Lkotlin/Function1;", "Lytd;", "routerBuilder", "childRouter", "(ILem6;)Lbbd;", "Lc83;", "childSlotRouter", "ignored", "findWidget-qk3jasM$arch_release", "(Ljava/lang/String;Lone/me/sdk/arch/Widget;)Lone/me/sdk/arch/Widget;", "findWidget", "outState", "onSaveInstanceState", "savedInstanceState", "onRestoreInstanceState", "target", "setTargetController", "(Lc54;)V", "Lm2i;", "type", "findWidgetByScopeId-qk3jasM$arch_release", "(Ljava/lang/String;Lm2i;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "Lx26;", "Ll38;", "minActiveState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "Lqt7;", "collectInViewScope", "(Lx26;Ll38;Lsm6;)Lqt7;", "", "key", "defaultValue", "Lhs;", "(Ljava/lang/String;Ljava/lang/Object;)Lhs;", "(Ljava/lang/String;)Lhs;", "action", "doActionIfRootExist", "(Lem6;)V", "Lf82;", "addIfNeedChildWidgetContainer", "()Lf82;", "getParentWidgetByScopeId-iP7A0G4", "(Ljava/lang/String;)Lone/me/sdk/arch/Widget;", "getParentWidgetByScopeId", "controller", "finalizeCleanActions", "I", "Le3i;", "viewModelStore", "Le3i;", "getViewModelStore$arch_release", "()Le3i;", "Lc9a;", "Lha3;", "cleanActions", "Lc9a;", "getCleanActions$arch_release", "()Lc9a;", "scopeId$delegate", "Lk18;", "getScopeId-IluPPks", "()Ljava/lang/String;", "Leo7;", "insetsConfig", "Leo7;", "getInsetsConfig", "()Leo7;", "Lk1e;", "screenDelegate", "Lk1e;", "getScreenDelegate", "()Lk1e;", "", "isDialog", "Z", "()Z", "tag", "Ljava/lang/String;", "internalTargetInstanceId", "p2i", "internalLifecycleListener", "Lp2i;", "Lp54;", "_viewLifecycleOwner", "Lp54;", "get_viewLifecycleOwner$annotations", "()V", "childWidgetContainer$delegate", "getChildWidgetContainer", "childWidgetContainer", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lv38;", "getLifecycleScope", "()Lv38;", "lifecycleScope", "Lj48;", "getViewLifecycleOwner", "()Lj48;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", SdkMetricStatEvent.VALUE_KEY, "getTargetWidget", "()Lone/me/sdk/arch/Widget;", "setTargetWidget", "(Lone/me/sdk/arch/Widget;)V", "targetWidget", "Companion", "j2i", "arch_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Widget extends c54 {
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    private static final String ARG_TARGET_KEY_INSTANCE = "target_key_instance_internal";
    public static final j2i Companion = new j2i();
    private static final AtomicInteger allocationsCount = new AtomicInteger(0);
    private p54 _viewLifecycleOwner;

    /* renamed from: childWidgetContainer$delegate, reason: from kotlin metadata */
    private final k18 childWidgetContainer;
    private final c9a cleanActions;
    private final eo7 insetsConfig;
    private final p2i internalLifecycleListener;
    private String internalTargetInstanceId;
    private final boolean isDialog;
    private final int layoutRes;

    /* renamed from: scopeId$delegate, reason: from kotlin metadata */
    private final k18 scopeId;
    private final k1e screenDelegate;
    private final String tag;
    private final e3i viewModelStore;

    /* JADX WARN: Multi-variable type inference failed */
    public Widget() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object binding$lambda$8(cm6 cm6Var, Object obj) {
        return cm6Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qqg binding$lambda$9(Widget widget, Object obj, ha3 ha3Var) {
        widget.cleanActions.i(obj, ha3Var);
        return qqg.a;
    }

    public static /* synthetic */ bbd childRouter$default(Widget widget, int i, em6 em6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: childRouter");
        }
        if ((i2 & 2) != 0) {
            em6Var = null;
        }
        return widget.childRouter(i, em6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ytd childRouter$lambda$10(Widget widget, int i, em6 em6Var, ytd ytdVar) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (em6Var == null) {
            return widget.getChildRouter(viewGroup);
        }
        ytd childRouter = widget.getChildRouter(viewGroup);
        em6Var.invoke(childRouter);
        return childRouter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c83 childSlotRouter$lambda$11(Widget widget, int i, c83 c83Var) {
        return new c83(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f82 childWidgetContainer_delegate$lambda$19(Widget widget) {
        f82 f82Var = new f82(widget.getContext());
        f82Var.setId(jzc.arch_child_widget_wrapper_id);
        return f82Var;
    }

    public static qt7 collectInViewScope$default(Widget widget, x26 x26Var, l38 l38Var, sm6 sm6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectInViewScope");
        }
        if ((i & 1) != 0) {
            l38Var = l38.d;
        }
        return gw0.w(new g56(aw0.a(x26Var, widget.getViewLifecycleOwner().p(), l38Var), new n2i(sm6Var, null), 1), widget.getViewLifecycleScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeCleanActions(c54 controller) {
        long[] jArr;
        long[] jArr2;
        int i;
        Object obj;
        lg8 lg8Var = lg8.o;
        if (this.cleanActions.h()) {
            return;
        }
        String strB = ari.b(controller);
        l6b l6bVar = wqi.a;
        WeakReference weakReference = null;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, strB, ho7.f(getCleanActions().e, "view detached, call onFinalize for clean actions "), null);
        }
        c9a c9aVar = this.cleanActions;
        Object[] objArr = c9aVar.c;
        long[] jArr3 = c9aVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            rn0 rn0Var = (rn0) ((ha3) objArr[(i2 << 3) + i5]);
                            if (!rn0Var.a) {
                                sn0 sn0Var = rn0Var.b;
                                sn0Var.o = new WeakReference(sn0Var.d);
                                sn0Var.d = weakReference;
                                rn0Var.a = true;
                            }
                            String strH = wy1.h("Binder:", ari.b(rn0Var.c));
                            sn0 sn0Var2 = rn0Var.b;
                            l6b l6bVar2 = wqi.a;
                            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                                WeakReference weakReference2 = sn0Var2.o;
                                if (weakReference2 != null) {
                                    i = i3;
                                    obj = weakReference2.get();
                                } else {
                                    i = i3;
                                    obj = weakReference;
                                }
                                jArr2 = jArr3;
                                weakReference = null;
                                l6bVar2.c(lg8Var, strH, "onFinalize " + weakReference2 + "/" + obj, null);
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            WeakReference weakReference3 = rn0Var.b.o;
                            if (weakReference3 != null) {
                                weakReference3.clear();
                            }
                            rn0Var.b.o = weakReference;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        this.cleanActions.a();
    }

    /* renamed from: findWidget-qk3jasM$arch_release$default, reason: not valid java name */
    public static /* synthetic */ Widget m32findWidgetqk3jasM$arch_release$default(Widget widget, String str, Widget widget2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findWidget-qk3jasM");
        }
        if ((i & 2) != 0) {
            widget2 = widget;
        }
        return widget.m37findWidgetqk3jasM$arch_release(str, widget2);
    }

    /* renamed from: findWidgetByScopeId-qk3jasM$arch_release$default, reason: not valid java name */
    public static /* synthetic */ Widget m33findWidgetByScopeIdqk3jasM$arch_release$default(Widget widget, String str, m2i m2iVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findWidgetByScopeId-qk3jasM");
        }
        if ((i & 2) != 0) {
            m2iVar = m2i.d;
        }
        return widget.m38findWidgetByScopeIdqk3jasM$arch_release(str, m2iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findWidgetByScopeId_qk3jasM$lambda$17(ytd ytdVar) {
        return ue3.N(ytdVar.e(), ",", "[", "]", new u7g(9), 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findWidgetByScopeId_qk3jasM$lambda$17$lambda$16(bud budVar) {
        StringBuilder sb = new StringBuilder();
        String str = budVar.b;
        c54 c54Var = budVar.a;
        if (str != null) {
            sb.append(str);
        } else {
            sb.append('_');
        }
        sb.append('/');
        Widget widget = c54Var instanceof Widget ? (Widget) c54Var : null;
        String strMo27getScopeIdIluPPks = widget != null ? widget.getV0() : null;
        if (strMo27getScopeIdIluPPks == null || fni.a(strMo27getScopeIdIluPPks, "default") || fni.a(strMo27getScopeIdIluPPks, "")) {
            sb.append('_');
        } else {
            sb.append(b1e.a(strMo27getScopeIdIluPPks));
        }
        sb.append('/');
        sb.append(c54Var.getClass().getName());
        return sb.toString();
    }

    private final f82 getChildWidgetContainer() {
        return (f82) this.childWidgetContainer.getValue();
    }

    /* renamed from: getParentWidgetByScopeId-iP7A0G4, reason: not valid java name */
    private final Widget m34getParentWidgetByScopeIdiP7A0G4(String scopeId) {
        if (fni.a(scopeId, "default") || fni.a(scopeId, "")) {
            return null;
        }
        return k8j.a(getRouter().i(), scopeId, this);
    }

    /* renamed from: getSharedViewModel-cp94BC8$default, reason: not valid java name */
    public static /* synthetic */ k18 m35getSharedViewModelcp94BC8$default(Widget widget, String str, Class cls, cm6 cm6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedViewModel-cp94BC8");
        }
        if ((i & 4) != 0) {
            cm6Var = null;
        }
        return widget.m39getSharedViewModelcp94BC8(str, cls, cm6Var);
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    /* renamed from: sharedViewModel-qk3jasM$default, reason: not valid java name */
    public static /* synthetic */ k18 m36sharedViewModelqk3jasM$default(Widget widget, String str, cm6 cm6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel-qk3jasM");
        }
        fni.h();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View viewBinding$lambda$5(Widget widget, int i, View view) {
        Object ipdVar;
        if (view != null) {
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            wqi.e(widget.tag, "Original Binder exception:", th);
            try {
                ipdVar = widget.getContext().getResources().getResourceName(i);
            } catch (Throwable th2) {
                ipdVar = new ipd(th2);
            }
            Object objF = ho7.f(i, "#");
            if (ipdVar instanceof ipd) {
                ipdVar = objF;
            }
            throw new BinderNotFoundValueException(wy1.h("could not find view ", (String) ipdVar), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qqg viewBinding$lambda$6(Widget widget, View view, ha3 ha3Var) {
        widget.cleanActions.i(view, ha3Var);
        return qqg.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean viewBinding$lambda$7(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final f82 addIfNeedChildWidgetContainer() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        if (getChildWidgetContainer().getParent() == null) {
            dqi.a(viewGroup, getChildWidgetContainer(), Integer.valueOf(viewGroup.getChildCount()));
        }
        return getChildWidgetContainer();
    }

    public final /* synthetic */ <T> hs args(String key, T defaultValue) {
        fni.h();
        throw null;
    }

    public final <T> sn0 binding(cm6 bindAction) {
        return new sn0(this, new dse(16, bindAction), new h2i(this, 1), 8);
    }

    public final bbd childRouter(int containerId, em6 routerBuilder) {
        return new sn0(this, new vq9(this, containerId, routerBuilder, 1), (h2i) null, 12);
    }

    public final bbd childSlotRouter(int containerId) {
        return new sn0(this, new g2i(this, containerId, 0), (h2i) null, 12);
    }

    public final <T> qt7 collectInViewScope(x26 x26Var, l38 l38Var, sm6 sm6Var) {
        return gw0.w(new g56(aw0.a(x26Var, getViewLifecycleOwner().p(), l38Var), new n2i(sm6Var, null), 1), getViewLifecycleScope());
    }

    public final <VM extends xfh> k18 createViewModelLazy(Class<VM> viewModelClass, cm6 factoryProducer) {
        e3i e3iVar = this.viewModelStore;
        wfh wfhVar = (wfh) factoryProducer.invoke();
        e3iVar.b.m("one.me.sdk.arch.ViewModelStore:key:" + viewModelClass.getCanonicalName(), wfhVar);
        return new o2i(this, viewModelClass);
    }

    public final void doActionIfRootExist(em6 action) {
        View view = getView();
        if (view != null) {
            action.invoke(view);
        }
    }

    public final <V extends View> V findViewById(int id) {
        View view = getView();
        if (view != null) {
            return (V) view.findViewById(id);
        }
        return null;
    }

    /* renamed from: findWidget-qk3jasM$arch_release, reason: not valid java name */
    public final Widget m37findWidgetqk3jasM$arch_release(String scopeId, Widget ignored) {
        if (fni.a(getV0(), scopeId)) {
            return this;
        }
        Iterator<ytd> it = getChildRouters().iterator();
        while (it.hasNext()) {
            Widget widgetA = k8j.a(it.next(), scopeId, ignored);
            if (widgetA != null && widgetA != ignored) {
                return widgetA;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* renamed from: findWidgetByScopeId-qk3jasM$arch_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final one.me.sdk.arch.Widget m38findWidgetByScopeIdqk3jasM$arch_release(java.lang.String r14, defpackage.m2i r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.arch.Widget.m38findWidgetByScopeIdqk3jasM$arch_release(java.lang.String, m2i):one.me.sdk.arch.Widget");
    }

    /* renamed from: getCleanActions$arch_release, reason: from getter */
    public final c9a getCleanActions() {
        return this.cleanActions;
    }

    public final Context getContext() {
        return requireActivity();
    }

    /* renamed from: getInsetsConfig, reason: from getter */
    public eo7 getA() {
        return this.insetsConfig;
    }

    public final v38 getLifecycleScope() {
        return cqi.e(this.lifecycleOwner);
    }

    /* renamed from: getScopeId-IluPPks */
    public String getV0() {
        return ((b1e) this.scopeId.getValue()).a;
    }

    /* renamed from: getScreenDelegate, reason: from getter */
    public k1e getJ0() {
        return this.screenDelegate;
    }

    /* renamed from: getSharedViewModel-cp94BC8, reason: not valid java name */
    public final <VM extends xfh> k18 m39getSharedViewModelcp94BC8(String scopeId, Class<VM> viewModelClass, cm6 defaultFactory) {
        return new bgh(this, scopeId, viewModelClass, defaultFactory);
    }

    public final Widget getTargetWidget() {
        c54 targetController = getTargetController();
        if (targetController instanceof Widget) {
            return (Widget) targetController;
        }
        return null;
    }

    public final j48 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final v38 getViewLifecycleScope() {
        return cqi.e(this._viewLifecycleOwner);
    }

    /* renamed from: getViewModelStore$arch_release, reason: from getter */
    public final e3i getViewModelStore() {
        return this.viewModelStore;
    }

    /* renamed from: isDialog, reason: from getter */
    public boolean getA0() {
        return this.isDialog;
    }

    @Override // defpackage.c54
    public void onActivityPaused(Activity activity) {
    }

    @Override // defpackage.c54
    public void onActivityResumed(Activity activity) {
    }

    @Override // defpackage.c54
    public void onChangeStarted(h54 changeHandler, i54 changeType) {
        if (changeType == i54.POP_ENTER || changeType == i54.PUSH_ENTER) {
            getJ0().a();
        }
    }

    @Override // defpackage.c54
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedViewState) {
        return inflater.inflate(this.layoutRes, container, false);
    }

    @Override // defpackage.c54
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        this.internalTargetInstanceId = savedInstanceState.getString(ARG_TARGET_KEY_INSTANCE);
    }

    @Override // defpackage.c54
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(ARG_TARGET_KEY_INSTANCE, this.internalTargetInstanceId);
    }

    public void onUpdateArgs(Bundle oldArgs, Bundle newArgs) {
    }

    public void onViewCreated(View view) {
    }

    public final ln requireActivity() {
        return (ln) getActivity();
    }

    public final Resources requireResources() {
        Resources resources = getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalArgumentException(("Resources are null because of widget " + this + " is not attached to an activity").toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("view is null!");
    }

    @Override // defpackage.c54
    public void setTargetController(c54 target) {
        this.internalTargetInstanceId = target != null ? target.getInstanceId() : null;
        super.setTargetController(target);
    }

    public final void setTargetWidget(Widget widget) {
        setTargetController(widget);
    }

    /* renamed from: sharedViewModel-qk3jasM, reason: not valid java name */
    public final /* synthetic */ <VM extends xfh> k18 m40sharedViewModelqk3jasM(String scopeId, cm6 defaultFactory) {
        fni.h();
        throw null;
    }

    public final void updateArgs(Bundle newArgs) {
        Bundle bundleDeepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(newArgs);
        onUpdateArgs(bundleDeepCopy, getArgs());
    }

    public final <T extends View> bbd viewBinding(int id) {
        return new sn0(this, new g2i(this, id, 1), new h2i(this, 0), new i2i(this, 0));
    }

    public final /* synthetic */ <VM extends xfh> k18 viewModel(cm6 vmProducer) {
        fni.h();
        throw null;
    }

    public /* synthetic */ Widget(Bundle bundle, int i, int i2, tk4 tk4Var) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? -1 : i);
    }

    public final /* synthetic */ <T> hs args(String key) {
        fni.h();
        throw null;
    }

    public Widget(Bundle bundle, int i) {
        super(bundle);
        this.layoutRes = i;
        this.viewModelStore = new e3i();
        this.cleanActions = new c9a(3);
        this.scopeId = ipi.b(3, new uif(15, bundle));
        this.insetsConfig = eo7.e;
        this.screenDelegate = v17.A0;
        this.tag = getClass().getName();
        p2i p2iVar = new p2i(this);
        this.internalLifecycleListener = p2iVar;
        p54 p54Var = new p54();
        p54Var.a = new l48(p54Var);
        addLifecycleListener(new m54(1, p54Var));
        this._viewLifecycleOwner = p54Var;
        wqi.h(getClass().getName(), "allocations count = " + allocationsCount.incrementAndGet(), null);
        addLifecycleListener(p2iVar);
        addLifecycleListener(mg8.b);
        this.childWidgetContainer = ipi.b(3, new kvf(25, this));
    }
}
