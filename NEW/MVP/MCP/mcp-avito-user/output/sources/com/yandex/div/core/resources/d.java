package com.yandex.div.core.resources;

import Y61.k;
import Y61.l;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import j.X;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/resources/d;", "Landroid/content/res/Resources;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class d extends Resources {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f367650a;

    public d(@k Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f367650a = resources;
    }

    @Override // android.content.res.Resources
    @X
    public final void addLoaders(@k ResourcesLoader... resourcesLoaderArr) {
        this.f367650a.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    @k
    public final XmlResourceParser getAnimation(int i12) {
        return this.f367650a.getAnimation(i12);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i12) {
        return this.f367650a.getBoolean(i12);
    }

    @Override // android.content.res.Resources
    public final int getColor(int i12) {
        return this.f367650a.getColor(i12);
    }

    @Override // android.content.res.Resources
    @k
    @X
    public final ColorStateList getColorStateList(int i12, @l Resources.Theme theme) {
        return this.f367650a.getColorStateList(i12, theme);
    }

    @Override // android.content.res.Resources
    @l
    public final Configuration getConfiguration() {
        return this.f367650a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i12) {
        return this.f367650a.getDimension(i12);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i12) {
        return this.f367650a.getDimensionPixelOffset(i12);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i12) {
        return this.f367650a.getDimensionPixelSize(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final DisplayMetrics getDisplayMetrics() {
        return this.f367650a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @l
    public final Drawable getDrawable(int i12, @l Resources.Theme theme) {
        return this.f367650a.getDrawable(i12, theme);
    }

    @Override // android.content.res.Resources
    @l
    public final Drawable getDrawableForDensity(int i12, int i13) {
        return this.f367650a.getDrawableForDensity(i12, i13);
    }

    @Override // android.content.res.Resources
    @X
    public final float getFloat(int i12) {
        return this.f367650a.getFloat(i12);
    }

    @Override // android.content.res.Resources
    @k
    @X
    public final Typeface getFont(int i12) {
        return this.f367650a.getFont(i12);
    }

    @Override // android.content.res.Resources
    public final float getFraction(int i12, int i13, int i14) {
        return this.f367650a.getFraction(i12, i13, i14);
    }

    @Override // android.content.res.Resources
    public final int getIdentifier(@l String str, @l String str2, @l String str3) {
        return this.f367650a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @k
    public final int[] getIntArray(int i12) {
        return this.f367650a.getIntArray(i12);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i12) {
        return this.f367650a.getInteger(i12);
    }

    @Override // android.content.res.Resources
    @k
    public final XmlResourceParser getLayout(int i12) {
        return this.f367650a.getLayout(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final Movie getMovie(int i12) {
        return this.f367650a.getMovie(i12);
    }

    @Override // android.content.res.Resources
    @k
    public final String getQuantityString(int i12, int i13, @k Object... objArr) {
        return this.f367650a.getQuantityString(i12, i13, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @k
    public final CharSequence getQuantityText(int i12, int i13) {
        return this.f367650a.getQuantityText(i12, i13);
    }

    @Override // android.content.res.Resources
    @l
    public final String getResourceEntryName(int i12) {
        return this.f367650a.getResourceEntryName(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final String getResourceName(int i12) {
        return this.f367650a.getResourceName(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final String getResourcePackageName(int i12) {
        return this.f367650a.getResourcePackageName(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final String getResourceTypeName(int i12) {
        return this.f367650a.getResourceTypeName(i12);
    }

    @Override // android.content.res.Resources
    @k
    public final String getString(int i12, @k Object... objArr) {
        return this.f367650a.getString(i12, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // android.content.res.Resources
    @k
    public final String[] getStringArray(int i12) {
        return this.f367650a.getStringArray(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final CharSequence getText(int i12, @l CharSequence charSequence) {
        return this.f367650a.getText(i12, charSequence);
    }

    @Override // android.content.res.Resources
    @k
    public final CharSequence[] getTextArray(int i12) {
        return this.f367650a.getTextArray(i12);
    }

    @Override // android.content.res.Resources
    public final void getValue(@l String str, @l TypedValue typedValue, boolean z12) throws Resources.NotFoundException {
        this.f367650a.getValue(str, typedValue, z12);
    }

    @Override // android.content.res.Resources
    public final void getValueForDensity(int i12, int i13, @l TypedValue typedValue, boolean z12) throws Resources.NotFoundException {
        this.f367650a.getValueForDensity(i12, i13, typedValue, z12);
    }

    @Override // android.content.res.Resources
    @k
    public final XmlResourceParser getXml(int i12) {
        return this.f367650a.getXml(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final TypedArray obtainAttributes(@l AttributeSet attributeSet, @l int[] iArr) {
        return this.f367650a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @k
    public final TypedArray obtainTypedArray(int i12) {
        return this.f367650a.obtainTypedArray(i12);
    }

    @Override // android.content.res.Resources
    @k
    public final InputStream openRawResource(int i12, @l TypedValue typedValue) {
        return this.f367650a.openRawResource(i12, typedValue);
    }

    @Override // android.content.res.Resources
    @l
    public final AssetFileDescriptor openRawResourceFd(int i12) {
        return this.f367650a.openRawResourceFd(i12);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtra(@l String str, @l AttributeSet attributeSet, @l Bundle bundle) throws XmlPullParserException {
        this.f367650a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public final void parseBundleExtras(@l XmlResourceParser xmlResourceParser, @l Bundle bundle) throws XmlPullParserException, IOException {
        this.f367650a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    @X
    public final void removeLoaders(@k ResourcesLoader... resourcesLoaderArr) {
        this.f367650a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(@l Configuration configuration, @l DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f367650a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @X
    public final int getColor(int i12, @l Resources.Theme theme) {
        return this.f367650a.getColor(i12, theme);
    }

    @Override // android.content.res.Resources
    @k
    public final ColorStateList getColorStateList(int i12) {
        return this.f367650a.getColorStateList(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final Drawable getDrawable(int i12) {
        return this.f367650a.getDrawable(i12);
    }

    @Override // android.content.res.Resources
    @l
    public final Drawable getDrawableForDensity(int i12, int i13, @l Resources.Theme theme) {
        return this.f367650a.getDrawableForDensity(i12, i13, theme);
    }

    @Override // android.content.res.Resources
    @k
    public final String getQuantityString(int i12, int i13) {
        return this.f367650a.getQuantityString(i12, i13);
    }

    @Override // android.content.res.Resources
    @k
    public final String getString(int i12) {
        return this.f367650a.getString(i12);
    }

    @Override // android.content.res.Resources
    @k
    public final CharSequence getText(int i12) {
        return this.f367650a.getText(i12);
    }

    @Override // android.content.res.Resources
    public final void getValue(int i12, @l TypedValue typedValue, boolean z12) throws Resources.NotFoundException {
        this.f367650a.getValue(i12, typedValue, z12);
    }

    @Override // android.content.res.Resources
    @k
    public final InputStream openRawResource(int i12) {
        return this.f367650a.openRawResource(i12);
    }
}
