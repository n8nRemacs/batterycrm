package com.avito.android.mortgage.sign.draw;

import Y61.k;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* compiled from: PathAction.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/c;", "", "a", "b", "c", "Lcom/avito/android/mortgage/sign/draw/c$a;", "Lcom/avito/android/mortgage/sign/draw/c$b;", "Lcom/avito/android/mortgage/sign/draw/c$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PathAction.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/c$a;", "Lcom/avito/android/mortgage/sign/draw/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final float f203625a;

        /* renamed from: b, reason: collision with root package name */
        public final float f203626b;

        public a(float f12, float f13) {
            this.f203625a = f12;
            this.f203626b = f13;
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        @k
        public final String a() {
            return "L " + this.f203625a + ' ' + this.f203626b;
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        public final void b(@k Path path) {
            ((C22277p) path).r(this.f203625a, this.f203626b);
        }
    }

    /* compiled from: PathAction.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/c$b;", "Lcom/avito/android/mortgage/sign/draw/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final float f203627a;

        /* renamed from: b, reason: collision with root package name */
        public final float f203628b;

        public b(float f12, float f13) {
            this.f203627a = f12;
            this.f203628b = f13;
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        @k
        public final String a() {
            return "M " + this.f203627a + ' ' + this.f203628b;
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        public final void b(@k Path path) {
            path.i(this.f203627a, this.f203628b);
        }
    }

    /* compiled from: PathAction.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/c$c;", "Lcom/avito/android/mortgage/sign/draw/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.sign.draw.c$c, reason: collision with other inner class name */
    public static final class C6071c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final float f203629a;

        /* renamed from: b, reason: collision with root package name */
        public final float f203630b;

        /* renamed from: c, reason: collision with root package name */
        public final float f203631c;

        /* renamed from: d, reason: collision with root package name */
        public final float f203632d;

        public C6071c(float f12, float f13, float f14, float f15) {
            this.f203629a = f12;
            this.f203630b = f13;
            this.f203631c = f14;
            this.f203632d = f15;
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        @k
        public final String a() {
            StringBuilder sb2 = new StringBuilder("Q ");
            float f12 = this.f203631c;
            sb2.append(f12);
            sb2.append(' ');
            float f13 = this.f203632d;
            sb2.append(f13);
            sb2.append(", ");
            float f14 = this.f203629a + f12;
            float f15 = 2;
            sb2.append(f14 / f15);
            sb2.append(' ');
            sb2.append((this.f203630b + f13) / f15);
            return sb2.toString();
        }

        @Override // com.avito.android.mortgage.sign.draw.c
        public final void b(@k Path path) {
            float f12 = this.f203629a;
            float f13 = this.f203631c;
            float f14 = 2;
            float f15 = this.f203630b;
            float f16 = this.f203632d;
            path.s(f13, f16, (f12 + f13) / f14, (f15 + f16) / f14);
        }
    }

    @k
    String a();

    void b(@k Path path);
}
