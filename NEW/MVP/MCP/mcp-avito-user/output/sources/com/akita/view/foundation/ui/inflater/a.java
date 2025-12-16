package com.akita.view.foundation.ui.inflater;

import Y41.p;
import Y41.r;
import Y61.k;
import Y61.l;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.N;

/* compiled from: AvitoLayoutInflater.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f66995a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f66996b = AppCompatTextView.class.getName();

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$a;", "Landroid/view/LayoutInflater$Factory2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.view.foundation.ui.inflater.a$a, reason: collision with other inner class name */
    public static final class LayoutInflaterFactory2C2118a implements LayoutInflater.Factory2 {
        @Override // android.view.LayoutInflater.Factory2
        @l
        public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
            throw null;
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            throw null;
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$b;", "Lcom/akita/view/foundation/ui/inflater/a$c;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f66997b = new LinkedHashMap();

        @Override // android.view.LayoutInflater.Factory2
        @l
        public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
            LayoutInflater.Factory2 factory2 = (LayoutInflater.Factory2) this.f66997b.get(str);
            if (factory2 != null) {
                return factory2.onCreateView(view, str, context, attributeSet);
            }
            return null;
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            return onCreateView(null, str, context, attributeSet);
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$c;", "Landroid/view/LayoutInflater$Factory2;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends LayoutInflater.Factory2 {

        /* renamed from: L1, reason: collision with root package name */
        @k
        public static final C2119a f66998L1 = C2119a.f66999a;

        /* compiled from: AvitoLayoutInflater.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$c$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.akita.view.foundation.ui.inflater.a$c$a, reason: collision with other inner class name */
        public static final class C2119a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ C2119a f66999a = new C2119a();
        }

        /* compiled from: AvitoLayoutInflater.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b {
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$d;", "Landroid/view/LayoutInflater$Factory2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements LayoutInflater.Factory2 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.akita.view.foundation.ui.inflater.b f67000b;

        public d(@k com.akita.view.foundation.ui.inflater.b bVar) {
            this.f67000b = bVar;
        }

        @Override // android.view.LayoutInflater.Factory2
        @l
        @Nullable
        public final View onCreateView(@l @Nullable View view, @NonNull @k String str, @NonNull @k Context context, @NonNull @k AttributeSet attributeSet) {
            return this.f67000b.onCreateView(view, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        @Nullable
        public final View onCreateView(@NonNull @k String str, @NonNull @k Context context, @NonNull @k AttributeSet attributeSet) {
            return this.f67000b.onCreateView(null, str, context, attributeSet);
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/foundation/ui/inflater/a$e;", "Landroid/view/LayoutInflater$Factory2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements LayoutInflater.Factory2 {
        @Override // android.view.LayoutInflater.Factory2
        @l
        public final View onCreateView(@l View view, @k String str, @k Context context, @k AttributeSet attributeSet) {
            return null;
        }

        @Override // android.view.LayoutInflater.Factory
        @l
        public final View onCreateView(@k String str, @k Context context, @k AttributeSet attributeSet) {
            return null;
        }
    }

    /* compiled from: AvitoLayoutInflater.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Landroid/view/View;", "<anonymous parameter 0>", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements r<View, String, Context, AttributeSet, View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f67001l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C42801a f67002m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(p pVar, String str) {
            super(4);
            this.f67001l = str;
            this.f67002m = (C42801a) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [Y41.p, kotlin.jvm.internal.a] */
        @Override // Y41.r
        public final View invoke(View view, String str, Context context, AttributeSet attributeSet) {
            Context context2 = context;
            AttributeSet attributeSet2 = attributeSet;
            if (str.equals(this.f67001l)) {
                return (View) this.f67002m.invoke(context2, attributeSet2);
            }
            return null;
        }
    }

    @k
    public static d a(@k p pVar, @k String str) {
        c.C2119a c2119a = c.f66998L1;
        f fVar = new f(pVar, str);
        c2119a.getClass();
        return new d(new com.akita.view.foundation.ui.inflater.b(fVar));
    }
}
