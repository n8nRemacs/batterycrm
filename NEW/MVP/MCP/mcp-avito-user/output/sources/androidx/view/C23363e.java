package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.view.AbstractC23301M0;
import androidx.view.C23312S0;
import androidx.view.C23317W;
import j.InterfaceC42153i;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;

/* compiled from: ActivityNavigator.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/e;", "Landroidx/navigation/M0;", "Landroidx/navigation/e$b;", "a", "b", "c", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC23301M0.b("activity")
/* renamed from: androidx.navigation.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23363e extends AbstractC23301M0<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f53107c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Activity f53108d;

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/navigation/e$a;", "", "<init>", "()V", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @C23317W.a
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/e$b;", "Landroidx/navigation/W;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.e$b */
    public static class b extends C23317W {

        /* renamed from: l, reason: collision with root package name */
        @l
        public Intent f53109l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public String f53110m;

        public b() {
            throw null;
        }

        @Override // androidx.view.C23317W
        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f53109l;
                if ((intent != null ? intent.filterEquals(((b) obj).f53109l) : ((b) obj).f53109l == null) && L.f(this.f53110m, ((b) obj).f53110m)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.view.C23317W
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f53109l;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f53110m;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.view.C23317W
        @InterfaceC42153i
        public void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C23312S0.c.f52871a);
            String string = typedArrayObtainAttributes.getString(4);
            String strA0 = string != null ? C43066x.a0(string, "${applicationId}", context.getPackageName(), false) : null;
            if (this.f53109l == null) {
                this.f53109l = new Intent();
            }
            this.f53109l.setPackage(strA0);
            String string2 = typedArrayObtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f53109l == null) {
                    this.f53109l = new Intent();
                }
                this.f53109l.setComponent(componentName);
            }
            String string3 = typedArrayObtainAttributes.getString(1);
            if (this.f53109l == null) {
                this.f53109l = new Intent();
            }
            this.f53109l.setAction(string3);
            String string4 = typedArrayObtainAttributes.getString(2);
            String strA02 = string4 != null ? C43066x.a0(string4, "${applicationId}", context.getPackageName(), false) : null;
            if (strA02 != null) {
                Uri uri = Uri.parse(strA02);
                if (this.f53109l == null) {
                    this.f53109l = new Intent();
                }
                this.f53109l.setData(uri);
            }
            String string5 = typedArrayObtainAttributes.getString(3);
            this.f53110m = string5 != null ? C43066x.a0(string5, "${applicationId}", context.getPackageName(), false) : null;
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.view.C23317W
        @k
        public final String toString() {
            Intent intent = this.f53109l;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.f53109l;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            return sb2.toString();
        }

        @Override // androidx.view.C23317W
        @RestrictTo
        public final boolean v() {
            return false;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/e$c;", "Landroidx/navigation/M0$a;", "a", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.e$c */
    public static final class c implements AbstractC23301M0.a {

        /* compiled from: ActivityNavigator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/e$c$a;", "", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.navigation.e$c$a */
        public static final class a {
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.e$d */
    public static final class d extends N implements Y41.l<Context, Context> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f53111l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Context invoke(Context context) {
            Context context2 = context;
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public C23363e(@k Context context) {
        Object next;
        this.f53107c = context;
        Iterator it = C43033p.u(d.f53111l, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f53108d = (Activity) next;
    }

    @Override // androidx.view.AbstractC23301M0
    public final C23317W c(C23317W c23317w, Bundle bundle, C23280B0 c23280b0, AbstractC23301M0.a aVar) throws Resources.NotFoundException {
        Intent intent;
        int intExtra;
        b bVar = (b) c23317w;
        if (bVar.f53109l == null) {
            throw new IllegalStateException(AK.c.i(bVar.f52886i, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
        }
        Intent intent2 = new Intent(bVar.f53109l);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = bVar.f53110m;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z12 = aVar instanceof c;
        if (z12) {
            ((c) aVar).getClass();
            intent2.addFlags(0);
        }
        Activity activity = this.f53108d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c23280b0 != null && c23280b0.f52742a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", bVar.f52886i);
        Context context = this.f53107c;
        Resources resources = context.getResources();
        if (c23280b0 != null) {
            int i12 = c23280b0.f52749h;
            int i13 = c23280b0.f52750i;
            if ((i12 <= 0 || !L.f(resources.getResourceTypeName(i12), "animator")) && (i13 <= 0 || !L.f(resources.getResourceTypeName(i13), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i12);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i13);
            } else {
                resources.getResourceName(i12);
                resources.getResourceName(i13);
                bVar.toString();
            }
        }
        if (z12) {
            ((c) aVar).getClass();
            context.startActivity(intent2);
        } else {
            context.startActivity(intent2);
        }
        if (c23280b0 == null || activity == null) {
            return null;
        }
        int i14 = c23280b0.f52747f;
        int i15 = c23280b0.f52748g;
        if ((i14 > 0 && L.f(resources.getResourceTypeName(i14), "animator")) || (i15 > 0 && L.f(resources.getResourceTypeName(i15), "animator"))) {
            resources.getResourceName(i14);
            resources.getResourceName(i15);
            bVar.toString();
            return null;
        }
        if (i14 < 0 && i15 < 0) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        activity.overridePendingTransition(i14, i15 >= 0 ? i15 : 0);
        return null;
    }

    @Override // androidx.view.AbstractC23301M0
    public final boolean j() {
        Activity activity = this.f53108d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.view.AbstractC23301M0
    @k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }
}
