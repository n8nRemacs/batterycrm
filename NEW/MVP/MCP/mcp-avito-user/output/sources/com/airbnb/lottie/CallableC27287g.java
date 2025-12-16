package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import okio.Y;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.airbnb.lottie.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class CallableC27287g implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f59578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f59579d;

    public /* synthetic */ CallableC27287g(int i12, String str, Object obj) {
        this.f59577b = i12;
        this.f59579d = obj;
        this.f59578c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f59578c;
        Object obj = this.f59579d;
        switch (this.f59577b) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                if (!lottieAnimationView.f59126k) {
                    return C27296p.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = C27296p.f59916a;
                return C27296p.b(context, str, "asset_" + str);
            case 1:
                return C27296p.d((InputStream) obj, str);
            case 2:
                HashMap map2 = C27296p.f59916a;
                return C27296p.e(JsonReader.m(new Y(okio.M.g(new ByteArrayInputStream(str.getBytes())))), (String) obj, true);
            default:
                return C27296p.h(null, (ZipInputStream) obj, str);
        }
    }

    public /* synthetic */ CallableC27287g(String str, String str2) {
        this.f59577b = 2;
        this.f59578c = str;
        this.f59579d = str2;
    }
}
