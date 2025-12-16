package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.eqf;
import defpackage.es0;
import defpackage.fvc;
import defpackage.gcg;
import defpackage.hfh;
import defpackage.hwc;
import defpackage.i5d;
import defpackage.jdc;
import defpackage.me3;
import defpackage.o6d;
import defpackage.p1d;
import defpackage.p3;
import defpackage.p7e;
import defpackage.q7e;
import defpackage.qb4;
import defpackage.r7e;
import defpackage.r98;
import defpackage.s7e;
import defpackage.t7e;
import defpackage.u7e;
import defpackage.v7e;
import defpackage.w48;
import defpackage.w7e;
import defpackage.whh;
import defpackage.x98;
import defpackage.zo;
import defpackage.zxc;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e extends w48 implements me3 {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final u7e PRE_API_29_HIDDEN_METHOD_INVOKER;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private r7e mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private s7e mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private t7e mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchView$SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    qb4 mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private w7e mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    static {
        u7e u7eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            u7e u7eVar2 = new u7e();
            u7eVar2.a = null;
            u7eVar2.b = null;
            u7eVar2.c = null;
            u7e.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                u7eVar2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                u7eVar2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                u7eVar2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            u7eVar = u7eVar2;
        }
        PRE_API_29_HIDDEN_METHOD_INVOKER = u7eVar;
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fvc.searchViewStyle);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(hwc.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(hwc.abc_search_view_preferred_width);
    }

    public static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean z = whh.a;
            boolean z2 = getLayoutDirection() == 1;
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(hwc.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(hwc.abc_dropdownitem_icon_width) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            this.mSearchSrcTextView.setDropDownHorizontalOffset(z2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public final Intent d(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void f() {
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mCloseButton.setVisibility(!zIsEmpty || (this.mIconifiedByDefault && !this.mExpandedInActionView) ? 0 : 8);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void forceSuggestionQuery() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            q7e.a(this.mSearchSrcTextView);
            return;
        }
        u7e u7eVar = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
        u7eVar.getClass();
        u7e.a();
        Method method = u7eVar.a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        u7e u7eVar2 = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete2 = this.mSearchSrcTextView;
        u7eVar2.getClass();
        u7e.a();
        Method method2 = u7eVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete2, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void g() {
        CharSequence queryHint = getQueryHint();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.mIconifiedByDefault && this.mSearchHintIcon != null) {
            int textSize = (int) (searchView$SearchAutoComplete.getTextSize() * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public qb4 getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public final void h() {
        this.mSubmitArea.setVisibility(((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    public final void i(boolean z) {
        boolean z2 = this.mSubmitButtonEnabled;
        this.mGoButton.setVisibility((!z2 || !(z2 || this.mVoiceButtonEnabled) || isIconified() || !hasFocus() || (!z && this.mVoiceButtonEnabled)) ? 8 : 0);
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public final void j(boolean z) {
        this.mIconified = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        i(!zIsEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null && !this.mIconifiedByDefault) {
            i = 0;
        }
        this.mCollapsedIcon.setVisibility(i);
        f();
        k(zIsEmpty);
        h();
    }

    public final void k(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(d("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    @Override // defpackage.me3
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        j(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // defpackage.me3
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        setIconified(false);
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            clearFocus();
            j(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onItemClicked(int r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r10 = "SearchView"
            qb4 r11 = r8.mSuggestionsAdapter
            android.database.Cursor r11 = r11.c
            if (r11 == 0) goto Lc5
            boolean r9 = r11.moveToPosition(r9)
            if (r9 == 0) goto Lc5
            r9 = 0
            int r0 = defpackage.eqf.H0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = defpackage.eqf.h(r11, r0)     // Catch: java.lang.RuntimeException -> L24
            if (r0 != 0) goto L27
            android.app.SearchableInfo r0 = r8.mSearchable     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = r0.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L24
            goto L27
        L24:
            r0 = move-exception
            r1 = r8
            goto L8a
        L27:
            if (r0 != 0) goto L2b
            java.lang.String r0 = "android.intent.action.SEARCH"
        L2b:
            r2 = r0
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = defpackage.eqf.h(r11, r0)     // Catch: java.lang.RuntimeException -> L24
            if (r0 != 0) goto L3e
            android.app.SearchableInfo r0 = r8.mSearchable     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = r0.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L24
        L3e:
            if (r0 == 0) goto L64
            java.lang.String r1 = "suggest_intent_data_id"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r1 = defpackage.eqf.h(r11, r1)     // Catch: java.lang.RuntimeException -> L24
            if (r1 == 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L24
            r3.<init>()     // Catch: java.lang.RuntimeException -> L24
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = "/"
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = android.net.Uri.encode(r1)     // Catch: java.lang.RuntimeException -> L24
            r3.append(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = r3.toString()     // Catch: java.lang.RuntimeException -> L24
        L64:
            if (r0 != 0) goto L68
            r3 = r9
            goto L6d
        L68:
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.RuntimeException -> L24
            r3 = r0
        L6d:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = defpackage.eqf.h(r11, r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = defpackage.eqf.h(r11, r0)     // Catch: java.lang.RuntimeException -> L24
            r6 = 0
            r7 = 0
            r1 = r8
            android.content.Intent r9 = r1.d(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L89
            goto La6
        L89:
            r0 = move-exception
        L8a:
            int r11 = r11.getPosition()     // Catch: java.lang.RuntimeException -> L8f
            goto L90
        L8f:
            r11 = -1
        L90:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Search suggestions cursor at row "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = " returned exception."
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.util.Log.w(r10, r11, r0)
        La6:
            if (r9 != 0) goto La9
            goto Lc6
        La9:
            android.content.Context r11 = r8.getContext()     // Catch: java.lang.RuntimeException -> Lb1
            r11.startActivity(r9)     // Catch: java.lang.RuntimeException -> Lb1
            goto Lc6
        Lb1:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed launch activity: "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.e(r10, r9, r11)
            goto Lc6
        Lc5:
            r1 = r8
        Lc6:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r9 = r1.mSearchSrcTextView
            r10 = 0
            r9.setImeVisibility(r10)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r9 = r1.mSearchSrcTextView
            r9.dismissDropDown()
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.onItemClicked(int, int, java.lang.String):boolean");
    }

    public boolean onItemSelected(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.c;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        String strC = this.mSuggestionsAdapter.c(cursor);
        if (strC != null) {
            setQuery(strC);
            return true;
        }
        setQuery(text);
        return true;
    }

    @Override // defpackage.w48, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            Rect rect = this.mSearchSrcTextViewBounds;
            searchView$SearchAutoComplete.getLocationInWindow(this.mTemp);
            getLocationInWindow(this.mTemp2);
            int[] iArr = this.mTemp;
            int i5 = iArr[1];
            int[] iArr2 = this.mTemp2;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchView$SearchAutoComplete.getWidth() + i7, searchView$SearchAutoComplete.getHeight() + i6);
            Rect rect2 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect3 = this.mSearchSrcTextViewBounds;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            w7e w7eVar = this.mTouchDelegate;
            if (w7eVar == null) {
                w7e w7eVar2 = new w7e(this.mSearchSrcTextView, this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
                this.mTouchDelegate = w7eVar2;
                setTouchDelegate(w7eVar2);
                return;
            }
            Rect rect4 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect5 = this.mSearchSrcTextViewBounds;
            w7eVar.b.set(rect4);
            Rect rect6 = w7eVar.d;
            rect6.set(rect4);
            int i8 = -w7eVar.e;
            rect6.inset(i8, i8);
            w7eVar.c.set(rect5);
        }
    }

    @Override // defpackage.w48, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v7e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v7e v7eVar = (v7e) parcelable;
        super.onRestoreInstanceState(v7eVar.a);
        j(v7eVar.c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        v7e v7eVar = new v7e(super.onSaveInstanceState());
        v7eVar.c = isIconified();
        return v7eVar;
    }

    public void onSearchClicked() {
        j(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.mSearchable != null) {
            launchQuerySearch(0, null, text.toString());
        }
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mSearchSrcTextView.dismissDropDown();
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.b();
                return true;
            }
            if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        i(!zIsEmpty);
        k(zIsEmpty);
        f();
        h();
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j(isIconified());
        post(this.mUpdateDrawableStateRunnable);
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(e(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } else {
                Intent intent = new Intent(this.mVoiceWebSearchIntent);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(LOG_TAG, "Could not find voice search activity");
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.mUpdateDrawableStateRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (zRequestFocus) {
            j(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault == z) {
            return;
        }
        this.mIconifiedByDefault = z;
        j(z);
        g();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(r7e r7eVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(s7e s7eVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(t7e t7eVar) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.mSearchSrcTextView;
            searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        g();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        qb4 qb4Var = this.mSuggestionsAdapter;
        if (qb4Var instanceof eqf) {
            ((eqf) qb4Var).z0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r6) {
        /*
            r5 = this;
            r5.mSearchable = r6
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L6b
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r5.mSearchSrcTextView
            int r6 = r6.getSuggestThreshold()
            r2.setThreshold(r6)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r5.mSearchSrcTextView
            android.app.SearchableInfo r2 = r5.mSearchable
            int r2 = r2.getImeOptions()
            r6.setImeOptions(r2)
            android.app.SearchableInfo r6 = r5.mSearchable
            int r6 = r6.getInputType()
            r2 = r6 & 15
            if (r2 != r1) goto L33
            r2 = -65537(0xfffffffffffeffff, float:NaN)
            r6 = r6 & r2
            android.app.SearchableInfo r2 = r5.mSearchable
            java.lang.String r2 = r2.getSuggestAuthority()
            if (r2 == 0) goto L33
            r2 = 589824(0x90000, float:8.2652E-40)
            r6 = r6 | r2
        L33:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r5.mSearchSrcTextView
            r2.setInputType(r6)
            qb4 r6 = r5.mSuggestionsAdapter
            if (r6 == 0) goto L3f
            r6.b(r0)
        L3f:
            android.app.SearchableInfo r6 = r5.mSearchable
            java.lang.String r6 = r6.getSuggestAuthority()
            if (r6 == 0) goto L68
            eqf r6 = new eqf
            android.content.Context r2 = r5.getContext()
            android.app.SearchableInfo r3 = r5.mSearchable
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r5.mOutsideDrawablesCache
            r6.<init>(r2, r5, r3, r4)
            r5.mSuggestionsAdapter = r6
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r5.mSearchSrcTextView
            r2.setAdapter(r6)
            qb4 r6 = r5.mSuggestionsAdapter
            eqf r6 = (defpackage.eqf) r6
            boolean r2 = r5.mQueryRefinement
            if (r2 == 0) goto L65
            r2 = 2
            goto L66
        L65:
            r2 = r1
        L66:
            r6.z0 = r2
        L68:
            r5.g()
        L6b:
            android.app.SearchableInfo r6 = r5.mSearchable
            r2 = 0
            if (r6 == 0) goto L9e
            boolean r6 = r6.getVoiceSearchEnabled()
            if (r6 == 0) goto L9e
            android.app.SearchableInfo r6 = r5.mSearchable
            boolean r6 = r6.getVoiceSearchLaunchWebSearch()
            if (r6 == 0) goto L81
            android.content.Intent r0 = r5.mVoiceWebSearchIntent
            goto L8b
        L81:
            android.app.SearchableInfo r6 = r5.mSearchable
            boolean r6 = r6.getVoiceSearchLaunchRecognizer()
            if (r6 == 0) goto L8b
            android.content.Intent r0 = r5.mVoiceAppSearchIntent
        L8b:
            if (r0 == 0) goto L9e
            android.content.Context r6 = r5.getContext()
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r3 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r0, r3)
            if (r6 == 0) goto L9e
            goto L9f
        L9e:
            r1 = r2
        L9f:
            r5.mVoiceButtonEnabled = r1
            if (r1 == 0) goto Laa
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r5.mSearchSrcTextView
            java.lang.String r0 = "nm"
            r6.setPrivateImeOptions(r0)
        Laa:
            boolean r6 = r5.isIconified()
            r5.j(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        j(isIconified());
    }

    public void setSuggestionsAdapter(qb4 qb4Var) {
        this.mSuggestionsAdapter = qb4Var;
        this.mSearchSrcTextView.setAdapter(qb4Var);
    }

    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new r98(20, this);
        this.mReleaseCursorRunnable = new a(this);
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        c cVar = new c(this);
        this.mOnClickListener = cVar;
        this.mTextKeyListener = new d(this);
        p7e p7eVar = new p7e(this);
        this.mOnEditorActionListener = p7eVar;
        zo zoVar = new zo(2, this);
        this.mOnItemClickListener = zoVar;
        x98 x98Var = new x98(1, this);
        this.mOnItemSelectedListener = x98Var;
        this.mTextWatcher = new p3(7, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o6d.SearchView, i, 0);
        jdc jdcVar = new jdc(context, typedArrayObtainStyledAttributes);
        hfh.m(this, context, o6d.SearchView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(o6d.SearchView_layout, p1d.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(zxc.search_src_text);
        this.mSearchSrcTextView = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(zxc.search_edit_frame);
        View viewFindViewById = findViewById(zxc.search_plate);
        this.mSearchPlate = viewFindViewById;
        View viewFindViewById2 = findViewById(zxc.submit_area);
        this.mSubmitArea = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(zxc.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(zxc.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(zxc.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(zxc.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(zxc.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        viewFindViewById.setBackground(jdcVar.t(o6d.SearchView_queryBackground));
        viewFindViewById2.setBackground(jdcVar.t(o6d.SearchView_submitBackground));
        imageView.setImageDrawable(jdcVar.t(o6d.SearchView_searchIcon));
        imageView2.setImageDrawable(jdcVar.t(o6d.SearchView_goIcon));
        imageView3.setImageDrawable(jdcVar.t(o6d.SearchView_closeIcon));
        imageView4.setImageDrawable(jdcVar.t(o6d.SearchView_voiceIcon));
        imageView5.setImageDrawable(jdcVar.t(o6d.SearchView_searchIcon));
        this.mSearchHintIcon = jdcVar.t(o6d.SearchView_searchHintIcon);
        gcg.a(imageView, getResources().getString(i5d.abc_searchview_description_search));
        this.mSuggestionRowLayout = typedArrayObtainStyledAttributes.getResourceId(o6d.SearchView_suggestionRowLayout, p1d.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = typedArrayObtainStyledAttributes.getResourceId(o6d.SearchView_commitIcon, 0);
        imageView.setOnClickListener(cVar);
        imageView3.setOnClickListener(cVar);
        imageView2.setOnClickListener(cVar);
        imageView4.setOnClickListener(cVar);
        searchView$SearchAutoComplete.setOnClickListener(cVar);
        searchView$SearchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchView$SearchAutoComplete.setOnEditorActionListener(p7eVar);
        searchView$SearchAutoComplete.setOnItemClickListener(zoVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(x98Var);
        searchView$SearchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new b(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(o6d.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o6d.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = typedArrayObtainStyledAttributes.getText(o6d.SearchView_defaultQueryHint);
        this.mQueryHint = typedArrayObtainStyledAttributes.getText(o6d.SearchView_queryHint);
        int i2 = typedArrayObtainStyledAttributes.getInt(o6d.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(o6d.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(o6d.SearchView_android_focusable, true));
        jdcVar.B();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new es0(15, this));
        }
        j(this.mIconifiedByDefault);
        g();
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
