package com.avito.android.photo_list_view_group_selection.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeImageGroup", "CloseScreen", "InitState", "SelectImageGroup", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$ChangeImageGroup;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$CloseScreen;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$InitState;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$SelectImageGroup;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoItemGroupSelectionInternalAction extends n {

    /* compiled from: PhotoItemGroupSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$ChangeImageGroup;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeImageGroup implements PhotoItemGroupSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f218448b;

        public ChangeImageGroup(@k String str) {
            this.f218448b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeImageGroup) && L.f(this.f218448b, ((ChangeImageGroup) obj).f218448b);
        }

        public final int hashCode() {
            return this.f218448b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeImageGroup(groupId="), this.f218448b, ')');
        }
    }

    /* compiled from: PhotoItemGroupSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$CloseScreen;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements PhotoItemGroupSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f218449b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -315888687;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: PhotoItemGroupSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$InitState;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitState implements PhotoItemGroupSelectionInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f218450b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<ImageGroup> f218451c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f218452d;

        public InitState(@k String str, @k List<ImageGroup> list, @l String str2) {
            this.f218450b = str;
            this.f218451c = list;
            this.f218452d = str2;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitState)) {
                return false;
            }
            InitState initState = (InitState) obj;
            return L.f(this.f218450b, initState.f218450b) && L.f(this.f218451c, initState.f218451c) && L.f(this.f218452d, initState.f218452d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f218450b.hashCode() * 31, 31, this.f218451c);
            String str = this.f218452d;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitState(header=");
            sb2.append(this.f218450b);
            sb2.append(", imageGroups=");
            sb2.append(this.f218451c);
            sb2.append(", currentGroupId=");
            return C22026a.c(sb2, this.f218452d, ')');
        }
    }

    /* compiled from: PhotoItemGroupSelectionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction$SelectImageGroup;", "Lcom/avito/android/photo_list_view_group_selection/mvi/entity/PhotoItemGroupSelectionInternalAction;", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectImageGroup implements PhotoItemGroupSelectionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f218453b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f218454c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f218455d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f218456e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f218457f;

        public SelectImageGroup(@k String str, @k String str2, boolean z12, @l String str3, @k String str4) {
            this.f218453b = str;
            this.f218454c = str2;
            this.f218455d = z12;
            this.f218456e = str3;
            this.f218457f = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectImageGroup)) {
                return false;
            }
            SelectImageGroup selectImageGroup = (SelectImageGroup) obj;
            return L.f(this.f218453b, selectImageGroup.f218453b) && L.f(this.f218454c, selectImageGroup.f218454c) && this.f218455d == selectImageGroup.f218455d && L.f(this.f218456e, selectImageGroup.f218456e) && L.f(this.f218457f, selectImageGroup.f218457f);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(this.f218453b.hashCode() * 31, 31, this.f218454c), 31, this.f218455d);
            String str = this.f218456e;
            return this.f218457f.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectImageGroup(imageId=");
            sb2.append(this.f218453b);
            sb2.append(", groupId=");
            sb2.append(this.f218454c);
            sb2.append(", imageLoaded=");
            sb2.append(this.f218455d);
            sb2.append(", groupTitle=");
            sb2.append(this.f218456e);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f218457f, ')');
        }
    }
}
