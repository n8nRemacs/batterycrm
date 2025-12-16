package yy;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.profile_management_core.edit_text_field.PopupTab;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SimplePageAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lyy/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lyy/a$a;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50322a extends RecyclerView.Adapter<C12933a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f443620c;

    /* compiled from: SimplePageAdapter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyy/a$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yy.a$a, reason: collision with other inner class name */
    public static final class C12933a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f443621b;

        public C12933a(@k View view) {
            super(view);
            this.f443621b = (TextView) view.findViewById(R.id.text);
        }
    }

    public C50322a(@k ArrayList arrayList) {
        this.f443620c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f443620c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        j.a(((C12933a) c12).f443621b, ((PopupTab.StoryTab.Story) this.f443620c.get(i12)).f226621c, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C12933a(C0.b(viewGroup, R.layout.edit_text_story_item, viewGroup, false));
    }
}
