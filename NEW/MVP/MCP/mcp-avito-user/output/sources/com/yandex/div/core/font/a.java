package com.yandex.div.core.font;

import android.graphics.Typeface;
import j.P;
import t21.InterfaceC48467b;

/* compiled from: DivTypefaceProvider.java */
@InterfaceC48467b
/* loaded from: classes7.dex */
public interface a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f367537b = new C10857a();

    /* compiled from: DivTypefaceProvider.java */
    /* renamed from: com.yandex.div.core.font.a$a, reason: collision with other inner class name */
    public class C10857a implements a {
        @Override // com.yandex.div.core.font.a
        @P
        public final Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.a
        @P
        public final Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.a
        @P
        public final Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.a
        @P
        public final Typeface getRegular() {
            return null;
        }
    }

    @P
    Typeface getBold();

    @P
    Typeface getLight();

    @P
    Typeface getMedium();

    @P
    Typeface getRegular();
}
