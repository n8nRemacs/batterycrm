package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import j.N;
import j.P;
import j.X;
import o.C44495a;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f46178a;

    /* compiled from: EmojiTextViewHelper.java */
    @X
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f46179a;

        /* renamed from: b, reason: collision with root package name */
        public final d f46180b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46181c = true;

        public a(TextView textView) {
            this.f46179a = textView;
            this.f46180b = new d(textView);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @N
        public final InputFilter[] a(@N InputFilter[] inputFilterArr) {
            if (!this.f46181c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i12 = 0; i12 < inputFilterArr.length; i12++) {
                    InputFilter inputFilter = inputFilterArr[i12];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i12, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i13 = 0;
                for (int i14 = 0; i14 < length; i14++) {
                    if (sparseArray.indexOfKey(i14) < 0) {
                        inputFilterArr2[i13] = inputFilterArr[i14];
                        i13++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i15 = 0;
            while (true) {
                d dVar = this.f46180b;
                if (i15 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i15] == dVar) {
                    return inputFilterArr;
                }
                i15++;
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final boolean b() {
            return this.f46181c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final void c(boolean z12) {
            if (z12) {
                TextView textView = this.f46179a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final void d(boolean z12) {
            this.f46181c = z12;
            TextView textView = this.f46179a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @P
        public final TransformationMethod e(@P TransformationMethod transformationMethod) {
            return this.f46181c ? ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod) : transformationMethod instanceof h ? ((h) transformationMethod).f46187a : transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    @X
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f46182a;

        public c(TextView textView) {
            this.f46182a = new a(textView);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @N
        public final InputFilter[] a(@N InputFilter[] inputFilterArr) {
            return !androidx.emoji2.text.e.g() ? inputFilterArr : this.f46182a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final boolean b() {
            return this.f46182a.f46181c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final void c(boolean z12) {
            if (androidx.emoji2.text.e.g()) {
                this.f46182a.c(z12);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public final void d(boolean z12) {
            boolean zG2 = androidx.emoji2.text.e.g();
            a aVar = this.f46182a;
            if (zG2) {
                aVar.d(z12);
            } else {
                aVar.f46181c = z12;
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @P
        public final TransformationMethod e(@P TransformationMethod transformationMethod) {
            return !androidx.emoji2.text.e.g() ? transformationMethod : this.f46182a.e(transformationMethod);
        }
    }

    public f(@N TextView textView) {
        this.f46178a = new c(textView);
    }

    @N
    public final InputFilter[] a(@N InputFilter[] inputFilterArr) {
        return this.f46178a.a(inputFilterArr);
    }

    public final boolean b() {
        return this.f46178a.b();
    }

    public final void c(boolean z12) {
        this.f46178a.c(z12);
    }

    public final void d(boolean z12) {
        this.f46178a.d(z12);
    }

    @P
    public final TransformationMethod e(@P C44495a c44495a) {
        return this.f46178a.e(c44495a);
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class b {
        public boolean b() {
            return false;
        }

        @N
        public InputFilter[] a(@N InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void c(boolean z12) {
        }

        public void d(boolean z12) {
        }

        @P
        public TransformationMethod e(@P TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
