package ca1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;

/* renamed from: ca1.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27141g extends RecyclerView.C {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f57943d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f57944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C27143i f57945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27141g(C27143i c27143i, View view) {
        super(view);
        this.f57945c = c27143i;
        this.f57944b = (TextView) view.findViewById(R.id.title);
    }
}
