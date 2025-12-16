package com.avito.android.lib.util.inflater;

import Y41.r;
import Y61.k;
import Y61.l;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.p;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.lib.design.shadow_layout.ShadowLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoLayoutInflater.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater;", "", "<init>", "()V", "a", "CompositeFactory", "b", "c", "d", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvitoLayoutInflater {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater f181382a = new AvitoLayoutInflater();

    /* renamed from: b, reason: collision with root package name */
    public static final String f181383b = Button.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static final String f181384c = Input.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f181385d = AppCompatTextView.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f181386e = AppCompatCheckedTextView.class.getName();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f181387f = "EditText";

    /* renamed from: g, reason: collision with root package name */
    public static final String f181388g = AppCompatEditText.class.getName();

    /* renamed from: h, reason: collision with root package name */
    public static final String f181389h = ShadowFrameLayout.class.getName();

    /* renamed from: i, reason: collision with root package name */
    public static final String f181390i = ShadowLinearLayout.class.getName();

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$CompositeFactory;", "Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$b;", "<init>", "()V", "", "name", "Landroid/view/LayoutInflater$Factory2;", "factory", "registerFactory", "(Ljava/lang/String;Landroid/view/LayoutInflater$Factory2;)Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$CompositeFactory;", "Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$c;", "factoryData", "(Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$c;)Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$CompositeFactory;", "", "isAllowed", "registerFactoryIf", "(Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$c;Z)Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$CompositeFactory;", "clearFactories", "()Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$CompositeFactory;", "Landroid/view/View;", "parent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "onCreateView", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "", "factories", "Ljava/util/Map;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompositeFactory implements b {

        @k
        private final Map<String, LayoutInflater.Factory2> factories = new LinkedHashMap();

        @k
        public final CompositeFactory clearFactories() {
            this.factories.clear();
            return this;
        }

        @Override // android.view.LayoutInflater.Factory2
        @l
        public View onCreateView(@l View parent, @k String name, @k Context context, @k AttributeSet attrs) {
            LayoutInflater.Factory2 factory2 = this.factories.get(name);
            if (factory2 != null) {
                return factory2.onCreateView(parent, name, context, attrs);
            }
            return null;
        }

        @k
        public final CompositeFactory registerFactory(@k String name, @k LayoutInflater.Factory2 factory) {
            this.factories.put(name, factory);
            return this;
        }

        @k
        public final CompositeFactory registerFactoryIf(@k c factoryData, boolean isAllowed) {
            if (isAllowed) {
                this.factories.put(factoryData.f181394b, factoryData);
            }
            return this;
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            return onCreateView(null, str, context, attributeSet);
        }

        @k
        public final CompositeFactory registerFactory(@k c factoryData) {
            this.factories.put(factoryData.f181394b, factoryData);
            return this;
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$a;", "Landroid/view/LayoutInflater$Factory2;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f181391b;

        public a(@k p pVar) {
            this.f181391b = pVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        @l
        public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
            return this.f181391b.g(str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            return this.f181391b.g(str, context, attributeSet);
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$b;", "Landroid/view/LayoutInflater$Factory2;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends LayoutInflater.Factory2 {

        /* renamed from: R1, reason: collision with root package name */
        @k
        public static final a f181392R1 = a.f181393a;

        /* compiled from: AvitoLayoutInflater.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$b$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f181393a = new a();
        }

        /* compiled from: AvitoLayoutInflater.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.util.inflater.AvitoLayoutInflater$b$b, reason: collision with other inner class name */
        public static final class C5331b {
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$c;", "Landroid/view/LayoutInflater$Factory2;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f181394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AvitoLayoutInflater$Factory$Companion$invoke$1 f181395c;

        public c(@k String str, @k AvitoLayoutInflater$Factory$Companion$invoke$1 avitoLayoutInflater$Factory$Companion$invoke$1) {
            this.f181394b = str;
            this.f181395c = avitoLayoutInflater$Factory$Companion$invoke$1;
        }

        @Override // android.view.LayoutInflater.Factory2
        @l
        @Nullable
        public final View onCreateView(@l @Nullable View view, @NonNull @k String str, @NonNull @k Context context, @NonNull @k AttributeSet attributeSet) {
            return onCreateView(view, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        @Nullable
        public final View onCreateView(@NonNull @k String str, @NonNull @k Context context, @NonNull @k AttributeSet attributeSet) {
            return onCreateView(str, context, attributeSet);
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Landroid/view/View;", "<anonymous parameter 0>", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements r<View, String, Context, AttributeSet, View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f181400l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f181401m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.p pVar, String str) {
            super(4);
            this.f181400l = str;
            this.f181401m = pVar;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [Y41.p, java.lang.Object] */
        @Override // Y41.r
        public final View invoke(View view, String str, Context context, AttributeSet attributeSet) {
            Context context2 = context;
            AttributeSet attributeSet2 = attributeSet;
            if (str.equals(this.f181400l)) {
                return (View) this.f181401m.invoke(context2, attributeSet2);
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.avito.android.lib.util.inflater.AvitoLayoutInflater$Factory$Companion$invoke$1] */
    @k
    public static c a(@k Y41.p pVar, @k String str) {
        b.a aVar = b.f181392R1;
        final e eVar = new e(pVar, str);
        aVar.getClass();
        return new c(str, new b() { // from class: com.avito.android.lib.util.inflater.AvitoLayoutInflater$Factory$Companion$invoke$1
            @Override // android.view.LayoutInflater.Factory
            @l
            public View onCreateView(@k String str2, @k Context context, @k AttributeSet attributeSet) {
                return onCreateView(null, str2, context, attributeSet);
            }

            @Override // android.view.LayoutInflater.Factory2
            @l
            public View onCreateView(@l View parent, @k String name, @k Context context, @k AttributeSet attrs) {
                return eVar.invoke(parent, name, context, attrs);
            }
        });
    }

    public static ContextThemeWrapper b(AvitoLayoutInflater avitoLayoutInflater, Context context, Integer num) {
        avitoLayoutInflater.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, num.intValue());
        LayoutInflater.from(contextThemeWrapper).setFactory2(new d(null, null, null, null));
        return contextThemeWrapper;
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/inflater/AvitoLayoutInflater$d;", "Landroid/view/LayoutInflater$Factory2;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LayoutInflater.Factory2 f181396b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LayoutInflater.Factory2 f181397c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f181398d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a f181399e;

        public d(@l LayoutInflater.Factory2 factory2, @l LayoutInflater.Factory2 factory22, @l a aVar, @l a aVar2) {
            this.f181396b = factory2;
            this.f181397c = factory22;
            this.f181398d = aVar;
            this.f181399e = aVar2;
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            View viewOnCreateView;
            LayoutInflater.Factory2 factory2 = this.f181396b;
            if (factory2 != null && (viewOnCreateView = factory2.onCreateView(str, context, attributeSet)) != null) {
                return viewOnCreateView;
            }
            a aVar = this.f181398d;
            if (aVar != null) {
                return aVar.onCreateView(null, str, context, attributeSet);
            }
            return null;
        }

        @Override // android.view.LayoutInflater.Factory2
        @l
        public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
            View viewOnCreateView;
            LayoutInflater.Factory2 factory2 = this.f181397c;
            if (factory2 != null && (viewOnCreateView = factory2.onCreateView(view, str, context, attributeSet)) != null) {
                return viewOnCreateView;
            }
            LayoutInflater.Factory2 factory22 = this.f181396b;
            View viewOnCreateView2 = factory22 != null ? factory22.onCreateView(str, context, attributeSet) : null;
            if (viewOnCreateView2 != null) {
                return viewOnCreateView2;
            }
            a aVar = this.f181399e;
            View viewOnCreateView3 = aVar != null ? aVar.onCreateView(view, str, context, attributeSet) : null;
            if (viewOnCreateView3 != null) {
                return viewOnCreateView3;
            }
            a aVar2 = this.f181398d;
            if (aVar2 != null) {
                return aVar2.onCreateView(null, str, context, attributeSet);
            }
            return null;
        }
    }
}
