package ru.avito.component.info_label;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoLabel.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/info_label/a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f430353a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f430354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f430355c;

    /* compiled from: InfoLabel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.component.info_label.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12398a {
        static {
            int[] iArr = new int[InfoLevel.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InfoLevel infoLevel = InfoLevel.f430349b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InfoLevel infoLevel2 = InfoLevel.f430349b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(@Y61.k View view) {
        this.f430353a = view;
        View viewFindViewById = view.findViewById(R.id.info_label_indicator);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f430354b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.info_label_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430355c = (TextView) viewFindViewById2;
    }
}
