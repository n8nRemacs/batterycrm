package com.avito.android.category_items_tree.screens.tree_screen.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TreeInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Content;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Error;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Loading;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface TreeInternalAction extends n {

    /* compiled from: TreeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Content;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TreeInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f117161b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f117162c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f117163d;

        public Content(@l AttributedText attributedText, @l AttributedText attributedText2, @k ArrayList arrayList) {
            this.f117161b = attributedText;
            this.f117162c = attributedText2;
            this.f117163d = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f117161b, content.f117161b) && L.f(this.f117162c, content.f117162c) && this.f117163d.equals(content.f117163d);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f117161b;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            AttributedText attributedText2 = this.f117162c;
            return this.f117163d.hashCode() + ((iHashCode + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f117161b);
            sb2.append(", subtitle=");
            sb2.append(this.f117162c);
            sb2.append(", items=");
            return e.p(sb2, this.f117163d, ')');
        }
    }

    /* compiled from: TreeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Error;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TreeInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f117164b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f117165c;

        public Error(@k ApiError apiError) {
            this.f117164b = apiError;
            this.f117165c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f117164b, ((Error) obj).f117164b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF220594e() {
            return this.f117165c;
        }

        public final int hashCode() {
            return this.f117164b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f117164b, ')');
        }
    }

    /* compiled from: TreeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TreeInternalAction {
    }
}
