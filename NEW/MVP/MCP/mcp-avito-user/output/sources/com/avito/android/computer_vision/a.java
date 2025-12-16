package com.avito.android.computer_vision;

import Y61.k;
import Y61.l;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;

/* compiled from: ComputerVisionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/computer_vision/a;", "", "_avito_photo-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    void b(@k String str);

    void c(@k Uri uri, @k String str);

    boolean d();

    boolean e();

    @k
    O f();

    void g(@l Integer num);

    void h(boolean z12);

    void i(@k Uri uri, @k String str);

    void reset();
}
