package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.mobile.ads.impl.rg;
import j.InterfaceC42156l;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes8.dex */
public final class vm implements rg {

    /* renamed from: r, reason: collision with root package name */
    public static final vm f390910r = new a().a("").a();

    /* renamed from: s, reason: collision with root package name */
    public static final rg.a<vm> f390911s = new Q0(10);

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final CharSequence f390912a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Layout.Alignment f390913b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final Layout.Alignment f390914c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final Bitmap f390915d;

    /* renamed from: e, reason: collision with root package name */
    public final float f390916e;

    /* renamed from: f, reason: collision with root package name */
    public final int f390917f;

    /* renamed from: g, reason: collision with root package name */
    public final int f390918g;

    /* renamed from: h, reason: collision with root package name */
    public final float f390919h;

    /* renamed from: i, reason: collision with root package name */
    public final int f390920i;

    /* renamed from: j, reason: collision with root package name */
    public final float f390921j;

    /* renamed from: k, reason: collision with root package name */
    public final float f390922k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f390923l;

    /* renamed from: m, reason: collision with root package name */
    public final int f390924m;

    /* renamed from: n, reason: collision with root package name */
    public final int f390925n;

    /* renamed from: o, reason: collision with root package name */
    public final float f390926o;

    /* renamed from: p, reason: collision with root package name */
    public final int f390927p;

    /* renamed from: q, reason: collision with root package name */
    public final float f390928q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private CharSequence f390929a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private Bitmap f390930b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private Layout.Alignment f390931c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private Layout.Alignment f390932d;

        /* renamed from: e, reason: collision with root package name */
        private float f390933e;

        /* renamed from: f, reason: collision with root package name */
        private int f390934f;

        /* renamed from: g, reason: collision with root package name */
        private int f390935g;

        /* renamed from: h, reason: collision with root package name */
        private float f390936h;

        /* renamed from: i, reason: collision with root package name */
        private int f390937i;

        /* renamed from: j, reason: collision with root package name */
        private int f390938j;

        /* renamed from: k, reason: collision with root package name */
        private float f390939k;

        /* renamed from: l, reason: collision with root package name */
        private float f390940l;

        /* renamed from: m, reason: collision with root package name */
        private float f390941m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f390942n;

        /* renamed from: o, reason: collision with root package name */
        @InterfaceC42156l
        private int f390943o;

        /* renamed from: p, reason: collision with root package name */
        private int f390944p;

        /* renamed from: q, reason: collision with root package name */
        private float f390945q;

        public /* synthetic */ a(vm vmVar, int i12) {
            this(vmVar);
        }

        public final a a(CharSequence charSequence) {
            this.f390929a = charSequence;
            return this;
        }

        public final a b(@j.P Layout.Alignment alignment) {
            this.f390931c = alignment;
            return this;
        }

        @Pure
        public final int c() {
            return this.f390935g;
        }

        @Pure
        public final int d() {
            return this.f390937i;
        }

        @j.P
        @Pure
        public final CharSequence e() {
            return this.f390929a;
        }

        public a() {
            this.f390929a = null;
            this.f390930b = null;
            this.f390931c = null;
            this.f390932d = null;
            this.f390933e = -3.4028235E38f;
            this.f390934f = BeduinInputModel.MIN_TEXT_VERSION;
            this.f390935g = BeduinInputModel.MIN_TEXT_VERSION;
            this.f390936h = -3.4028235E38f;
            this.f390937i = BeduinInputModel.MIN_TEXT_VERSION;
            this.f390938j = BeduinInputModel.MIN_TEXT_VERSION;
            this.f390939k = -3.4028235E38f;
            this.f390940l = -3.4028235E38f;
            this.f390941m = -3.4028235E38f;
            this.f390942n = false;
            this.f390943o = -16777216;
            this.f390944p = BeduinInputModel.MIN_TEXT_VERSION;
        }

        public final a a(Bitmap bitmap) {
            this.f390930b = bitmap;
            return this;
        }

        public final a b(float f12) {
            this.f390936h = f12;
            return this;
        }

        public final a c(int i12) {
            this.f390944p = i12;
            return this;
        }

        public final a d(float f12) {
            this.f390940l = f12;
            return this;
        }

        public final void a(@j.P Layout.Alignment alignment) {
            this.f390932d = alignment;
        }

        public final a b(int i12) {
            this.f390937i = i12;
            return this;
        }

        public final void c(float f12) {
            this.f390945q = f12;
        }

        public final void d(@InterfaceC42156l int i12) {
            this.f390943o = i12;
            this.f390942n = true;
        }

        public final a a(int i12, float f12) {
            this.f390933e = f12;
            this.f390934f = i12;
            return this;
        }

        public final void b(int i12, float f12) {
            this.f390939k = f12;
            this.f390938j = i12;
        }

        public final a a(int i12) {
            this.f390935g = i12;
            return this;
        }

        public final void b() {
            this.f390942n = false;
        }

        public final a a(float f12) {
            this.f390941m = f12;
            return this;
        }

        public final vm a() {
            return new vm(this.f390929a, this.f390931c, this.f390932d, this.f390930b, this.f390933e, this.f390934f, this.f390935g, this.f390936h, this.f390937i, this.f390938j, this.f390939k, this.f390940l, this.f390941m, this.f390942n, this.f390943o, this.f390944p, this.f390945q, 0);
        }

        private a(vm vmVar) {
            this.f390929a = vmVar.f390912a;
            this.f390930b = vmVar.f390915d;
            this.f390931c = vmVar.f390913b;
            this.f390932d = vmVar.f390914c;
            this.f390933e = vmVar.f390916e;
            this.f390934f = vmVar.f390917f;
            this.f390935g = vmVar.f390918g;
            this.f390936h = vmVar.f390919h;
            this.f390937i = vmVar.f390920i;
            this.f390938j = vmVar.f390925n;
            this.f390939k = vmVar.f390926o;
            this.f390940l = vmVar.f390921j;
            this.f390941m = vmVar.f390922k;
            this.f390942n = vmVar.f390923l;
            this.f390943o = vmVar.f390924m;
            this.f390944p = vmVar.f390927p;
            this.f390945q = vmVar.f390928q;
        }
    }

    public /* synthetic */ vm(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f12, int i12, int i13, float f13, int i14, int i15, float f14, float f15, float f16, boolean z12, int i16, int i17, float f17, int i18) {
        this(charSequence, alignment, alignment2, bitmap, f12, i12, i13, f13, i14, i15, f14, f15, f16, z12, i16, i17, f17);
    }

    public final a a() {
        return new a(this, 0);
    }

    public final boolean equals(@j.P Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || vm.class != obj.getClass()) {
            return false;
        }
        vm vmVar = (vm) obj;
        return TextUtils.equals(this.f390912a, vmVar.f390912a) && this.f390913b == vmVar.f390913b && this.f390914c == vmVar.f390914c && ((bitmap = this.f390915d) != null ? !((bitmap2 = vmVar.f390915d) == null || !bitmap.sameAs(bitmap2)) : vmVar.f390915d == null) && this.f390916e == vmVar.f390916e && this.f390917f == vmVar.f390917f && this.f390918g == vmVar.f390918g && this.f390919h == vmVar.f390919h && this.f390920i == vmVar.f390920i && this.f390921j == vmVar.f390921j && this.f390922k == vmVar.f390922k && this.f390923l == vmVar.f390923l && this.f390924m == vmVar.f390924m && this.f390925n == vmVar.f390925n && this.f390926o == vmVar.f390926o && this.f390927p == vmVar.f390927p && this.f390928q == vmVar.f390928q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390912a, this.f390913b, this.f390914c, this.f390915d, Float.valueOf(this.f390916e), Integer.valueOf(this.f390917f), Integer.valueOf(this.f390918g), Float.valueOf(this.f390919h), Integer.valueOf(this.f390920i), Float.valueOf(this.f390921j), Float.valueOf(this.f390922k), Boolean.valueOf(this.f390923l), Integer.valueOf(this.f390924m), Integer.valueOf(this.f390925n), Float.valueOf(this.f390926o), Integer.valueOf(this.f390927p), Float.valueOf(this.f390928q)});
    }

    private vm(@j.P CharSequence charSequence, @j.P Layout.Alignment alignment, @j.P Layout.Alignment alignment2, @j.P Bitmap bitmap, float f12, int i12, int i13, float f13, int i14, int i15, float f14, float f15, float f16, boolean z12, int i16, int i17, float f17) {
        if (charSequence == null) {
            db.a(bitmap);
        } else {
            db.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f390912a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f390912a = charSequence.toString();
        } else {
            this.f390912a = null;
        }
        this.f390913b = alignment;
        this.f390914c = alignment2;
        this.f390915d = bitmap;
        this.f390916e = f12;
        this.f390917f = i12;
        this.f390918g = i13;
        this.f390919h = f13;
        this.f390920i = i14;
        this.f390921j = f15;
        this.f390922k = f16;
        this.f390923l = z12;
        this.f390924m = i16;
        this.f390925n = i15;
        this.f390926o = f14;
        this.f390927p = i17;
        this.f390928q = f17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vm a(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            aVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            aVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            aVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            aVar.a(bitmap);
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            aVar.a(bundle.getInt(Integer.toString(5, 36)), bundle.getFloat(Integer.toString(4, 36)));
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            aVar.a(bundle.getInt(Integer.toString(6, 36)));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            aVar.b(bundle.getFloat(Integer.toString(7, 36)));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            aVar.b(bundle.getInt(Integer.toString(8, 36)));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            aVar.b(bundle.getInt(Integer.toString(9, 36)), bundle.getFloat(Integer.toString(10, 36)));
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            aVar.d(bundle.getFloat(Integer.toString(11, 36)));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.a(bundle.getFloat(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.d(bundle.getInt(Integer.toString(13, 36)));
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            aVar.b();
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.c(bundle.getInt(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.c(bundle.getFloat(Integer.toString(16, 36)));
        }
        return aVar.a();
    }
}
